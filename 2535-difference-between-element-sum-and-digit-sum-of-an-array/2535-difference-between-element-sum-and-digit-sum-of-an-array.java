class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;
        for(int i=0; i<nums.length; i++){
            esum = esum + nums[i];
        }
        for(int i=0;i<nums.length;i++){
           int x = nums[i];
           while(x>0){
            int d = x%10;
            dsum = dsum + d;
            x = x/10;
           }
        }
        return esum - dsum;
    }
}