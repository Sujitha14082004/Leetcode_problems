class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int sum1=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            sum1+=nums[nums.length-1-i];
        }
        return Math.abs(sum1-sum);
    }
}