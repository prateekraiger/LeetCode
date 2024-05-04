class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1 );
        }
        List<Integer> lst=new ArrayList<>();

        for(int i: nums2){
            if(map.containsKey(i) && map.get(i) >0){
                lst.add(i);
                map.put(i,map.get(i) -1);
            }
        }

        int res[]=new int[lst.size()];
        for(int i=0;i<lst.size();i+=1){
            res[i]=lst.get(i);
        }
        return res;

    }
}