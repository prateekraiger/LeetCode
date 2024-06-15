class Solution {
    public int[] sortArray(int[] nums) {
        int l=0,r=nums.length-1;  
        mergesort(nums,l,r);
        return nums;
    }

    public void mergesort(int arr[],int l,int r){
        if(l<r){
            int m=l + (r-l)/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            
            merge(arr,l,m,r);
        }
    }

    public void merge(int arr[],int l,int m,int r){
        //now we havae 2 array then sizes of them are
        int n1=m-l +1;
        int n2=r-m;

        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[m +1 +i];
        }

        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                arr[k++]=arr1[i++];
            }
            else{
                arr[k++]=arr2[j++];
            }
        }

        while(i<n1) arr[k++]=arr1[i++];
        while(i<n2) arr[k++]=arr2[j++];

    }
}