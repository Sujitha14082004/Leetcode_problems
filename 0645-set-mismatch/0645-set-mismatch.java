class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];  //return type
        int n = nums.length;
        /////////////////////////
        int freq[] = new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int z=0;
        int z1=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                z=i;
            }
            if(freq[i]==0){
                z1=i;
            }
        }
        arr[0] = z;
        arr[1] = z1;
        return arr;
    }
}