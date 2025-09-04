class Solution {
    static boolean[][]bool;
    public boolean exist(char[][] board, String word) {
        int count=0;
        bool = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j]){
                    if(dfs(board,word,i,j,count)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][]board,String word,int i,int j,int count){
        if(word.length()==count){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || bool[i][j] || word.charAt(count)!=board[i][j]){
            return false;
        }
        bool[i][j]=true;
        boolean ans= dfs(board,word,i+1,j,count+1) || dfs(board,word,i-1,j,count+1) || dfs(board,word,i,j+1,count+1) || dfs(board,word,i,j-1,count+1);
        bool[i][j]=false;
        return ans==true;
    }
}