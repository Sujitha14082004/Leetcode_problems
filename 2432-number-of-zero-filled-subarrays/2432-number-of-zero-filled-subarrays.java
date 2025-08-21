class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int count=0;
        long num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                num+=count;
            }
            else{
                count=0;
            }
        }
        return num;
    }
}