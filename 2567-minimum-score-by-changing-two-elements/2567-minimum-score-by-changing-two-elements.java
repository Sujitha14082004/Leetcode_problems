class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int s1=nums[nums.length-1]-nums[2];
        int s2=nums[nums.length-2]-nums[1];
        int s3=nums[nums.length-3]-nums[0];
        return Math.min(s1,Math.min(s2,s3));
    }
}