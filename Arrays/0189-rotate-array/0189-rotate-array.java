class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length ==0 || k%nums.length==0){
            return;
        }

        k=k % nums.length;
        //reverse the full array
        reverse(nums,0,nums.length -1);
        //revrerse the remaining array 
        reverse(nums,0,k-1);
        //reverse the rem element
        reverse(nums,k,nums.length-1);     

    }

    private static void reverse(int nums[],int st,int end){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }

    }
}