class Solution {
    public int minSwaps(int[] nums) {
        int odd=0;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        if(Math.abs(even-odd)>1){
            return -1;
        }
        int swap1=0;
        int pos1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                swap1+=Math.abs(i-pos1);
                pos1+=2;
            }
        }
        int swap2=0;
        int pos2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                swap2+=Math.abs(i-pos2);
                pos2+=2;
            }
        }
        if(odd>even){
            return swap2;
        }
        if(even>odd){
            return swap1;
        }
        return Math.min(swap1, swap2);
    }
}