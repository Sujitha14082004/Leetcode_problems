class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        int max=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]>max){
                max=freq[nums[i]];
            }
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max){
                ans=ans+freq[i];
            }
        }
        return ans;
    }
}