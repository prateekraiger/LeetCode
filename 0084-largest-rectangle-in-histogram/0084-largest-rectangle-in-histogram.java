class Solution {
    public int largestRectangleArea(int[] arr) {
        

        int maxArea=0;
        int nsr[]=new int [arr.length];
        int nsl[]=new int [arr.length];

        //next smaller right
        Stack<Integer> stk=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i] ){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=stk.peek();
            }
            stk.push(i);
        }
        //next smaller left
        stk=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i] ){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=stk.peek();
            }
            stk.push(i);
        }

        //current area=widtth=j-i-1= nsr[i]- nsl[i] -1
        for(int i=0;i<arr.length;i++){
            int hei=arr[i];
            int wid=nsr[i] -nsl[i] -1;
            int currArea=hei*wid;

            maxArea=Math.max(maxArea, currArea);
        }

        return maxArea;
        
    
    }
}