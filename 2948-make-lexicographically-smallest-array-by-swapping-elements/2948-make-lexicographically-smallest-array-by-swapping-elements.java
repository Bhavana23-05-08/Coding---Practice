import java.util.*;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        
        // 1. Create a sorted copy of the array to find valid chains/components
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        // Maps a value to its connected component group ID
        Map<Integer, Integer> numToGroup = new HashMap<>();
        // Maps a group ID to a queue containing its elements in sorted order
        Map<Integer, Queue<Integer>> groupToList = new HashMap<>();
        
        int groupID = 0;
        numToGroup.put(sortedNums[0], groupID);
        groupToList.put(groupID, new LinkedList<>());
        groupToList.get(groupID).offer(sortedNums[0]);
        
        // 2. Separate values into groups where sequential difference is <= limit
        for (int i = 1; i < n; i++) {
            if (sortedNums[i] - sortedNums[i - 1] > limit) {
                groupID++; // The numerical gap is too wide; start a new group
            }
            numToGroup.put(sortedNums[i], groupID);
            if (!groupToList.containsKey(groupID)) {
                groupToList.put(groupID, new LinkedList<>());
            }
            groupToList.get(groupID).offer(sortedNums[i]);
        }
        
        // 3. Reconstruct the array by fetching the smallest available number for each index's group
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int group = numToGroup.get(nums[i]);
            result[i] = groupToList.get(group).poll(); // Dequeues the smallest remaining group member
        }
        
        return result;
    }
}
