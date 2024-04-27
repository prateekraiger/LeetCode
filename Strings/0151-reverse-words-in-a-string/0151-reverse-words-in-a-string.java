class Solution {
    public String reverseWords(String s) {

        char str[] = s.toCharArray();
        reverse(str, 0, s.length() - 1);
        reverseWords(str);
        return cleanSpace(str);

    }

    private void reverse(char[] str, int left, int right) {
        while (left < right) {
            char tmp = str[left];
            str[left] = str[right];
            str[right] = tmp;
            left++;
            right--;
        }
    }

    private void reverseWords(char[] str) {
        int left = 0, right = 0;
        while (left < str.length) {
            while (left < str.length && str[left] == ' ')
                left++;
            right = left;

            while (right < str.length && str[right] != ' ')
                right++;
            reverse(str, left, right - 1);
            left = right;
        }
    }

    private String cleanSpace(char[] str) {
        int left = 0, right = 0;
        while (right < str.length) {
            while (right < str.length && str[right] == ' ')
                right++;
            while (right < str.length && str[right] != ' ') {
                str[left] = str[right];
                left++;
                right++;
            }
            while (right < str.length && str[right] == ' ')
                right++;
            if (right < str.length) {
                str[left] = ' ';
                left++;
            }
        }
        return new String(str).substring(0, left);
    }
}