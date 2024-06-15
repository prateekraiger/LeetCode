class Solution {
    public int longestPalindrome(String s) {
        int[] ch = new int[128];
        for (char c : s.toCharArray()){
            ch[c]++;
        }
        
        int pl = 0;
        for (int c : ch) {
            pl += c / 2 * 2;
            if (pl % 2 == 0 && c % 2 == 1) {
                pl++;
            }
        }
        return pl;
    }
}
