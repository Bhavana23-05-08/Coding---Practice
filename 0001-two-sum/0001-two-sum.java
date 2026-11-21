class Solution {
    public int[] twoSum(int[] nums, int target) {
        int idx1 = -1,idx2=-1;
        int flag = 0;
        for(int i=0;i<nums.length-1;i++){
            int sum = 0;
            for(int j=1;j<nums.length;j++){
                if(i!=j&&nums[i]+nums[j]==target){
                    idx1 = i;
                    idx2 = j;
                    flag =1 ;
                }
            }
            if(flag==1){
                break;
            }
        }
        return new int[]{idx1,idx2};
    }
}