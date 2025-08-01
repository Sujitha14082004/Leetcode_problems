class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList();
            for(int j=0;j<=i;j++){
                if (j==0 || j==i){             //for starting index or ending index
                    row.add(1);
                }
                else{
                   List<Integer> previousrow = pascal.get(i-1); 
                   row.add(previousrow.get(j)+previousrow.get(j-1));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}