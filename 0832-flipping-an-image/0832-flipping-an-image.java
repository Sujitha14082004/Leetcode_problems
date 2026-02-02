class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] ans=new int[n][n];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                ans[i][j]=image[i][n-1-j];
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(ans[i][j]==0){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j]=0;
                }
            }
        }
        return ans;
    }
}
