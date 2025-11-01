class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[i]=0;
            }
            else{
                int index=((i+nums[i])%n+n)%n;
                ans[i]=nums[index];
            }
        } 
        return ans;
    }
}