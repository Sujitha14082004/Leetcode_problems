class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n+n];
        int p = 0;
        for(int i=0;i<n;i++){
            ans[p++] = nums[i];
        }
        for(int i=0;i<n;i++){
            ans[p++] = nums[i];
        }
        return ans;
    }
}