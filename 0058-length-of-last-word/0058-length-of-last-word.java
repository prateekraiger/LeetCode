class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        boolean flag=false;

        for(int i=s.length()-1 ; i>=0;i--){
            if(s.charAt(i) !=' '){
                flag=true;
                len++;
            }
            else{
                if(flag){
                    break;
                }
            }
        }

        return len;

    }
}