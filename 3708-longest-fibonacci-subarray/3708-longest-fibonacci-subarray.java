class Solution {
    public int longestSubarray(int[] nums) {
        int max=2;
        int current=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]+nums[i-2]==nums[i]){
                current++;
            }
            else{
                current=2;
            }
            max=Math.max(max,current);
        }
        return max;
    }
}