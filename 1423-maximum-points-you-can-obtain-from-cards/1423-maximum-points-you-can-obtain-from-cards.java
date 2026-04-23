class Solution {
    public int maxScore(int[] arr, int k) {
        int max = 0;
        int lsum = 0;
        int rsum = 0;
        int n = arr.length;
        for(int i=0;i<k;i++){
            lsum = lsum + arr[i];
            max = lsum;
        }
        int rig=n-1;
        for(int j=k-1;j>=0;j--){
            lsum = lsum - arr[j];
            rsum = rsum + arr[rig];
            rig--;
            max = Math.max(max, rsum+lsum);
        }
        return max;

    }
}