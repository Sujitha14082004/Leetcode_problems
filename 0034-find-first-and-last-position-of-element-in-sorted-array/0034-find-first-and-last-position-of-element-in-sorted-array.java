class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstindex = -1;
        int lastindex = -1;
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                firstindex = i;
                break;
            }
        }
         for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                lastindex = i;
                break;
            }
        }
        ans[0] = firstindex;
        ans[1] = lastindex;
        return ans;
    }
}