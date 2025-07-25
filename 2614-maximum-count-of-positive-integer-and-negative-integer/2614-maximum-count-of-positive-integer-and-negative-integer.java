class Solution {
    public int maximumCount(int[] nums) {
        int max = 0;
        int min = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(nums[i]>0){
                    max++;
                }
                else{
                    min++;
                }
            }
        }
        return Math.max(max,min);
    }
}