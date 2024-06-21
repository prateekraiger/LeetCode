class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> ans=new HashMap<>();

        for(String s:strs){
            int cnt[]=new int[26];
            for(char c:s.toCharArray()){
                cnt[c - 'a']++;
            }

            String k=Arrays.toString(cnt);
            if(!ans.containsKey(k)){
                ans.put(k,new ArrayList<>());
            }
            ans.get(k).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}