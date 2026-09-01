class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int p = n*n;
        int[] differences = new int[p];
        int k =0;
       for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                if(nums[i]==1&&nums[j]==2){
                    int diff = i-j;
                    if(diff<0) diff = -diff;
                    differences[k]=diff;
                    k++;
                }
            }
       }
       if(k==0){
        return -1;
       } 
       int min = differences[0];
       for(int i=0;i<k;i++){
        if(differences[i]<min) min = differences[i];
       }
       return min;
    }
}