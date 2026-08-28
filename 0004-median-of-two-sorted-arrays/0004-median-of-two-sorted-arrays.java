class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[]ans=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            ans[k++]=nums2[i];
        }
        Arrays.sort(ans);
        int middle=ans.length/2;
        double median;
        if(ans.length%2!=0){
            median=(double)(ans[middle]);
        }
        else{
            median=(double)(ans[middle]+ans[middle-1])/2;
        }
        return median;
    }
}