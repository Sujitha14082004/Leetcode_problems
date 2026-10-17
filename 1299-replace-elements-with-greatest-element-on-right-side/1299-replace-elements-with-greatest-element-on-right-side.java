class Solution {
    public int[] replaceElements(int[] arr) {
        int res = -1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>res){
               int temp=res;
                res=arr[i];
                arr[i]=temp;
            }
            else{
                arr[i] = res;
            }
        }
        return arr;
    }
}