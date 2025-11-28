class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=(nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
        }
        return ans;
    }
}