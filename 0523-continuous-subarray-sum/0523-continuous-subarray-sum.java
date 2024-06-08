class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int s=0;

        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(k!=0){
                s=s%k;
            }
            Integer prev=map.get(s);
            if(prev !=null){
                if(i-prev > 1) return true;
            }
            else{
                map.put(s,i);
            }
        }
        return false;
    }
}