class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxCount=0;
        int count=1;
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }
            if(count>maxCount){
                maxCount = count;
            }
            if(maxCount>=count && nums[i]<=nums[i-1]){
                count=1;
            }
        }
        return maxCount;
    }
}