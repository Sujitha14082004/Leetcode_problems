class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> element = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                element.add(nums[i]);
            }
        }
        for(int i=0;i<element.size();i++){
            nums[i] = element.get(i);
        }
        return element.size();
    }
}