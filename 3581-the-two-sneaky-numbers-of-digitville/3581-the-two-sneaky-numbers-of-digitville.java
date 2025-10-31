class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length-2;
        int[]freq=new int[n];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int[] ans=new int[2];
        int index=0;
        for(int i=0;i<n;i++){
            if(freq[i]==2){
                ans[index++]=i;
            }
        }
        return ans;
    }
}