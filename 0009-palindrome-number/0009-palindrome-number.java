class Solution {
    public boolean isPalindrome(int x) {
       /* int n = x;
        int rev = 0;
        int rem = 0;
        if(x<0 || ( x%10 ==0 && x!=0)){
            return false;
        }
        else{
            while(x > 0){
                rem = x%10;
                rev = rev+rem;
                x=x/10;
            }
            
        }
            return rev == n;
       // return false;*/
       String s = String.valueOf(x);
       String reverse = new StringBuilder(s).reverse().toString();
       if(s.equals(reverse)){
            return true;
       }else{
        return false;
       }
    }
}