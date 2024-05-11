class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new LinkedList<>();
        
        for(int i=0;i<=nums.length-3;i++){
            if(i==0 || nums[i] != nums[i-1]){
                int l=i+1,r=nums.length-1;
                int tar=0-nums[i];
                while(l <r){
                    if(nums[l] +nums[r] == tar){
                        List<Integer> trip=new ArrayList<>();
                        trip.add(nums[i]);
                        trip.add(nums[l]);
                        trip.add(nums[r]);
                        ans.add(trip);

                        while( l < nums.length-1 && nums[l]==nums[l+1] ) l++;
                        while(r > 0 &&  nums[r] == nums[r-1]) r--;

                        l++;
                        r--;
                    }
                    else if(nums[l] + nums[r] < tar){
                        l++;
                    }
                    else{
                        r--;
                    }

                }
            }
        }


        return ans;

    }
}