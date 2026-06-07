class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int ans1=list1.get(list1.size()-1);
            int ans2=list2.get(list2.size()-1);
            if(ans1>ans2){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        int[]res=new int[nums.length];
        int index=0;
        for(int i=0;i<list1.size();i++){
            res[index]=list1.get(i);
            index++;
        }
        for(int i=0;i<list2.size();i++){
            res[index]=list2.get(i);
            index++;
        }
        return res;
    }
}