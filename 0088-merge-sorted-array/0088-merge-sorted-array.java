class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=0;i<m;i++){
            nums1[k++] = nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            nums1[k++] = nums2[j];
        }
        Arrays.sort(nums1);

    }
}