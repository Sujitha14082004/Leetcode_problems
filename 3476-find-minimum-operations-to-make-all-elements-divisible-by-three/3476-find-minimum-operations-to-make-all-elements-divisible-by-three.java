class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int remainder=nums[i]%3;
            if(remainder==1 || remainder==2){
                count++;
            }
        }
        return count;
    }
}