class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    boolean found=true;
                    for(int k=0;k<mat[0].length;k++){
                        if(k!=j && mat[i][k]==1){
                            found=false;
                            break;
                        }
                    }
                    for(int k=0;k<mat.length;k++){
                        if(k!=i && mat[k][j]==1){
                            found=false;
                            break;
                        }
                    }
                    if(found){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}