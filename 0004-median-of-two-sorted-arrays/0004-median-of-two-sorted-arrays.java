class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int[] ans = new int[a+b];
        int k=0;
        for(int i=0;i<a;i++){
            ans[k++]=nums1[i];
        }
        for(int j=0;j<b;j++){
            ans[k++]=nums2[j];
        }
        Arrays.sort(ans);
        int middle = ans.length/2;
        double median;
        if(ans.length%2==0){
            median = (double)(ans[middle]+ans[middle-1])/2;
        }
        else{
            median = (double)(ans[middle]);
        }
        return median;
    }
}