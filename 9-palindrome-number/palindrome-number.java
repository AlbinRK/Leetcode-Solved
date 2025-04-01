class Solution {
    public boolean isPalindrome(int x) {
         if(x<0) return false;
       if(x<10) return true;
       if(x%10 == 0 && x != 0) return false;
       int palin = 0;
       while(x>palin){
            palin = (palin*10) + x % 10;
            x = x/10;
            
       }
        return x == palin || x == palin/10;
    }
}