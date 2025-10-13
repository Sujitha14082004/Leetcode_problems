class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]<=threshold){
                for(int j=i;j<nums.length;j++){
                    if(nums[j]>threshold){
                        break;
                    }
                    if(j>i && nums[j]%2==nums[j-1]%2){
                        break;
                    }
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}