class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        // best keyboard 
        String str="123456789";
        List<Integer> lst=new ArrayList<>();

        for(int i=1;i<=9;i++){
            for(int j=0;i+j <=9 ; j++){
                String temp=str.substring(j,i+j);
                int val=Integer.valueOf(temp);

                if(val >=low && val <=high ){
                    lst.add(val);
                }
            }
        }

        return lst;
    }
}