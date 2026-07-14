class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] freq=new int[1001];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                int num=nums[i][j];
                freq[num]++;
            }
        }
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<freq.length;i++){
            if(freq[i]==n){
                list.add(i);
            }
        }
        return list;
    }
}