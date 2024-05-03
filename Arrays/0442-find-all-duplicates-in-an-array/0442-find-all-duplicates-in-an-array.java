class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lst=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i]) -1;

            if(nums[idx] < 0){
                lst.add(Math.abs(nums[i]) );
            }
            if(nums[idx] >0){
                nums[idx]= - nums[idx];
            }
        }
        return lst;

    }
}