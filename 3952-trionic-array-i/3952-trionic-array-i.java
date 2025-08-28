class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        for(int i=1;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(isIncreasing(nums,0,i) && isDecreasing(nums,i,j) && isIncreasing(nums,j,n-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isIncreasing(int[]nums,int start,int end){
        for(int i=start;i<end;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isDecreasing(int[]nums,int start,int end){
        for(int i=start;i<end;i++){
            if(nums[i]<=nums[i+1]){
                return false;
            }
        }
        return true;
    }
}