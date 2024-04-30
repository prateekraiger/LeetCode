class Solution {
    public void moveZeroes(int[] nums) {
        //using Queue
        // if(nums.length==1){
        //     return;
        // }

        // Queue<Integer> q=new LinkedList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         q.add(nums[i]);
        //     }
        // }

        // int idx=0;
        // while(q.size() !=0){
        //     nums[idx]=q.poll();
        //     idx++;
        // }

        // for(int i=idx;i<nums.length;i++){
        //     nums[i]=0;
        // }


        // using 2 pointers
        if(nums.length==1){
            return;
        }

        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                nums[left]=nums[right];
                left++;
            }
        }

        for(int i=left;i<nums.length;i++){
            nums[i]=0;
        }


    }
}