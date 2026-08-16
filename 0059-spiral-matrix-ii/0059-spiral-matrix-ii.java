class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int [n][n];
        int strow = 0;
        int endrow = n-1;
        int stcol = 0;
        int endcol = n-1;
        int val = 1;

        while(strow<=endrow && stcol<=endcol){
            for(int i = stcol; i<=endcol; i++){
                ans[strow][i] = val++;
            }
            strow++;

            for(int j = strow; j<=endrow; j++){
                ans[j][endcol] = val++;
            }
            endcol--;
                for(int k = endcol; k>=stcol; k--){
                ans[endrow][k] = val++;
                }
            endrow--;
                for(int l = endrow; l>=strow; l--){
                ans[l][stcol] = val++;
            }
    
            stcol++;
        }
        return ans;
    }
}