class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int a:arr){
            if(a %2 ==1){
                c+=1;
            }
            else{
                c=0;
            }
            
        if(c==3)    return true;
        
        }
        
        return false;
    }
}