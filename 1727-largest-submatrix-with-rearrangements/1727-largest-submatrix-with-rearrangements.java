class Solution {
    public int largestSubmatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]+=matrix[i-1][j];
                }
            }
        }
        int max=0;
        for(int i=0;i<matrix.length;i++){
            Arrays.sort(matrix[i]);
            for(int j=0;j<matrix[0].length;j++){
                int height=matrix[i][j];
                int width=matrix[0].length-j;
                max=Math.max(max, height*width);
            }
        }
        return max;
    }
}