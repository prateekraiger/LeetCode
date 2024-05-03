class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        
        int leftp=1;
        for(int i=0;i<n;i++){
            res[i]=leftp;
            leftp*=nums[i];
        }

        int rightp=1;
        for(int i=n-1;i>=0;i--){
            res[i]*=rightp;
            rightp*=nums[i];
        }

        return res;
    }
}