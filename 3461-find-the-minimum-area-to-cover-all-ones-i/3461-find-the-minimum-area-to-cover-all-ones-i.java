class Solution {
    public int minimumArea(int[][] grid) {
        int minrow=grid.length;
        int maxrow=-1;
        int mincolumn=grid[0].length;
        int maxcolumn=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    minrow=Math.min(minrow,i);
                    maxrow=Math.max(maxrow,i);
                    mincolumn=Math.min(mincolumn,j);
                    maxcolumn=Math.max(maxcolumn,j);
                }
            }
        }
        if(maxrow==-1){
            return 0;
        }
        return ((maxrow-minrow+1)*(maxcolumn-mincolumn+1));
    }
}