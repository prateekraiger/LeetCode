class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char ch1[] = ransomNote.toCharArray();
        char ch2[] = magazine.toCharArray();
        int[] letters = new int[26];

        for (char c : ch2) {
            letters[c - 'a']++;
        }

        for (char c : ch1) {
            if (letters[c - 'a'] <= 0) {
                return false;
            }
            letters[c - 'a']--;
        }

        return true;
    }
}
