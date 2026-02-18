class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n=nums.length;
        int count=0;
        while(nums[0]!=1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1){
                    int temp=nums[i];
                    nums[i]=nums[i-1];
                    nums[i-1]=temp;
                    count++;
                    break;
                }
            }
        }
        while(nums[n-1]!=n){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==n){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}