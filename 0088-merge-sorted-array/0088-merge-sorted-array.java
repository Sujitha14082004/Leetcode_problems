class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        for(int i=0;i<m;i++){
            nums1[index++]=nums1[i];
        }
        for(int j=0;j<n;j++){
            nums1[index++]=nums2[j];
        }
        Arrays.sort(nums1);
    }
}