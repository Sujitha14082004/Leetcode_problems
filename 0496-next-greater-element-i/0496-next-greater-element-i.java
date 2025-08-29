class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int nextgreater=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                        nextgreater=nums2[k];
                        break;
                    }
                }
                break;
                }
            }
            list.add(nextgreater);
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}