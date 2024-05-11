class Solution {
    public int longestValidParentheses(String s) {
        int ans = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push(i);
            } else {
                stk.pop();
                if (stk.empty()) {
                    stk.push(i);
                } else {
                    ans = Math.max(ans, i - stk.peek());
                }

            }
        }
        return ans;
        
    }
}