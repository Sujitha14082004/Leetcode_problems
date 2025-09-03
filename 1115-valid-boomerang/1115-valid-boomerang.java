class Solution {
    public boolean isBoomerang(int[][] points) {
        int[] a=points[0];
        int[] b=points[1];
        int[] c=points[2];
        int area=a[0]*(b[1]-c[1])+b[0]*(c[1]-a[1])+c[0]*(a[1]-b[1]);
        return area!=0;
    }
}