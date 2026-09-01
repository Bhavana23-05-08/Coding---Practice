class Solution {
    public int countPairs(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                if(nums[i]==nums[j]&&(i!=j)){
                    if((i*j)%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}