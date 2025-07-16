class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int fir = 0;
        int sec = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    fir = i;
                    sec = j;
                }
            }
        }
        ans[0] = fir;
        ans[1] = sec;
        return ans;
    }
}