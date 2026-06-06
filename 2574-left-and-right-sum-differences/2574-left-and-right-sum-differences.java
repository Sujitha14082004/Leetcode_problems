class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ls=new int[nums.length];
        int[] rs=new int[nums.length];
        int[] ans=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            ls[i]=ls[i-1]+nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            rs[j]=rs[j+1]+nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
            ans[k]=Math.abs(ls[k]-rs[k]);
        }
        return ans;
    }
}