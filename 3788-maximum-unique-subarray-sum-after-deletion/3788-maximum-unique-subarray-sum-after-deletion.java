class Solution {
    public int maxSum(int[] nums) {
       List<Integer> list = new ArrayList<>();
       int sum=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        if(!(list.contains(nums[i]))){
            list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        if(max<0){
            return max;
        }
        else{
            for(int i=0;i<list.size();i++){
                if(list.get(i)>0){
                    sum = sum+list.get(i);
                }
            }
        }
       return sum;
    }
}