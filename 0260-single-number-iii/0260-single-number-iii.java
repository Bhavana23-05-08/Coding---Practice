class Solution {
    public int[] singleNumber(int[] nums) {
        int g1 =0;
        int g2 = 0;
        int x = 0;
        for(int v : nums){
            x=x^v;
        }
        for(int i:nums){
            int low = x & -x;
            if((i&low)!=0){
                g1^=i;
            }else{
                g2^=i;
            }
        }
        return new int[]{g1,g2};
    }
}