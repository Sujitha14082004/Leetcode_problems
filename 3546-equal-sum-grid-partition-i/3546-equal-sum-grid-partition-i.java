class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long total=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                total+=grid[i][j];
            }
        }
        if(total%2!=0){
            return false;
        }
        long target=total/2;
        long rowsum=0;
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[0].length;j++){
                rowsum+=grid[i][j];
            }
            if(rowsum==target){
                return true;
            }
        }
        long columnsum=0;
        for(int j=0;j<grid[0].length-1;j++){
            for(int i=0;i<grid.length;i++){
                columnsum+=grid[i][j];
            }
            if(columnsum==target){
                return true;
            }
        }
        return false;
    }
}