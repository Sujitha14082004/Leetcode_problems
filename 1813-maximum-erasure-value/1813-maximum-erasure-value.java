class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer>set =new HashSet<>();
        int i=0;
        int sum = 0;
        int max = 0;
        for(int j=0;j<nums.length;j++){
            while(set.contains(nums[j])){
                sum = sum-nums[i];
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);
            sum = sum+nums[j];
            max = Math.max(max,sum);
        }
        return max;
    }
}