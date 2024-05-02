class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=-1;

        for(int i: nums){
            set.add(i);
        }

        for(int i: set){
            if(i>0 && set.contains(-i)){
                max=Math.max(max,i);
            }
        }
        
        return max;
    }
}