class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] cost = new int[n]; // Cost array for each character pair

        // Calculate the cost for each character pair
        for (int i = 0; i < n; i++) {
            cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int left = 0; // Left pointer of the sliding window
        int currentCost = 0; // Current cost within the window
        int maxLength = 0; // Maximum length of valid substring

        // Iterate through the characters
        for (int right = 0; right < n; right++) {
            currentCost += cost[right];

            // Shrink the window if the cost exceeds maxCost
            while (currentCost > maxCost) {
                currentCost -= cost[left];
                left++;
            }

            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
