
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves = 0, prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= prev) {
                moves += prev - nums[i] + 1;
                prev++;
            } else {
                prev = nums[i];
            }
        }
        return moves;
    }
}
