class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[]ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Set<Integer>set=new HashSet<>();
            Set<Integer>set1=new HashSet<>();
            for(int j=0;j<=i;j++){
                set.add(nums[j]);
            }
            for(int j=i+1;j<nums.length;j++){
                set1.add(nums[j]);
            }
            ans[i]=set.size()-set1.size();
        }
        return ans;
    }
}