class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length; i++){
            set.add(nums[i]);
        }
        int cnt = set.size();
        int count = 0;
        for(int i=0;i<nums.length; i++){
            Set<Integer> set1 = new HashSet<>();
            for(int j=i;j<nums.length;j++){
                set1.add(nums[j]);
            if(set1.size()==cnt){
                count++;
            }
        }
        }
        return count;
    }
}