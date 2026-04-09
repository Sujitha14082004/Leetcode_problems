class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        Set<Integer>set2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        Set<Integer>difference1=new HashSet<>(set1);
        difference1.removeAll(set2);
        Set<Integer>difference2=new HashSet<>(set2);
        difference2.removeAll(set1);

        List<List<Integer>>ans=new ArrayList<>();
        ans.add(new ArrayList<>(difference1));
        ans.add(new ArrayList<>(difference2));

        return ans;
    }
}