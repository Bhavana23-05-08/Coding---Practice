class Solution {
    public int mySqrt(int x) {
        int l =0,h=x,ans=0;
        if(x==0|| x==1){
            return x;
        }
        while(l<=h){
            int m = l+(h-l)/2;
            if((long)m*m == x){
                ans=m;
                break;
            }
            else if((long)m*m<x){
                ans = m;
                l = m+1;
            }
            else h =m-1;
        }
        return ans;
    }
}