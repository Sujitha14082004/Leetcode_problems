class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int count=0;
        int leftsum=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            int rightsum=sum-leftsum;
            if((leftsum-rightsum)%2==0){
                count++;
            }
        }
        return count;
    }
}