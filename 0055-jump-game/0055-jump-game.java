class Solution {
    public boolean canJump(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length && i<=cnt;i++){
            cnt=Math.max(cnt,i+nums[i]);
            if(cnt >= nums.length-1){
                return true;
            }
        }
        return false;

    }
}