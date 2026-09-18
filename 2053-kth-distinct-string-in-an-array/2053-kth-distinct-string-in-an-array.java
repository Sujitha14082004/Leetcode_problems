class Solution {
    public String kthDistinct(String[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            boolean found=true;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i].equals(arr[j])){
                    found=false;
                }
            }
            if(found){
                k--;
                if(k==0){
                    return (arr[i]);
                }
            }
        }
        return "";
    }
}