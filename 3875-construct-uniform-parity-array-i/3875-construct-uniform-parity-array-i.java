/*class Solution {
    public boolean uniformArray(int[] nums1) {
        int count1=0,count2=0;
        if(nums1.length==1)return true;
        for(int i =0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i =0;i<nums1.length;i++){
            for(int j =0;j<nums1.length;j++){
                if(i!=j){
                    int x = nums1[i]-nums1[j];
                    if(x<0)x=-x;
                    if(x%2!=0){
                        count1++;
                    }else{
                        count2++;
                    }
                }
            }
        }
        if((count1==nums1.length) || (count2 ==  nums1.length)){
            return false;
        }
        return true;
    }
}*/
class Solution {
    public boolean uniformArray(int[] nums1) {
        return true; 
    }
}
