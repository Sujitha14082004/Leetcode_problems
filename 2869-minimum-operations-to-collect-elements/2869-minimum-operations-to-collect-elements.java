class Solution {
    public int minOperations(List<Integer> nums, int k) {
        boolean[]found=new boolean[k+1];
        int result=k;
        for(int i=nums.size()-1;i>=0;i--){
            int ans=nums.get(i);
            if(ans<=k && !found[ans]){
                found[ans]=true;
                result--;
            }
            if(result==0){
                return nums.size()-i;
            }
        }
        return nums.size();
    }
}