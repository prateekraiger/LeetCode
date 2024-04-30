class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1){
            return;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                q.add(nums[i]);
            }
        }

        int idx=0;
        while(q.size() !=0){
            nums[idx]=q.poll();
            idx++;
        }

        for(int i=idx;i<nums.length;i++){
            nums[i]=0;
        }

    }
}