class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x!=0 && x%10==0){
            return false;
        }
        
        int rev=0;
        while(x>rev){
            int last=x%10;
            rev=rev*10 +last;
            x=x/10;
        }

        return (x==rev) ||(x==rev/10);
    }
}
