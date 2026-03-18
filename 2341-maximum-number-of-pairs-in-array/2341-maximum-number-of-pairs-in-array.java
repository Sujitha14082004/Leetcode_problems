class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                count++;
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        int size=set.size();
        return new int[]{count,size};
    }
}