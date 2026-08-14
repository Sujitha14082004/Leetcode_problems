class Solution {
    public int findDuplicate(int[] nums) {
        int freq [] = new int [100001];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        } 
        int c=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                c = i;
            }
        }
        return c;
    }
}