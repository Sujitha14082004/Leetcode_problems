class Solution {
    public int findCenter(int[][] edges) {
       int row=edges[0][0];
       int column=edges[0][1];
       if(edges[1][0]==row || edges[1][1]==row){
        return row;
       }
       return column;
    }
}