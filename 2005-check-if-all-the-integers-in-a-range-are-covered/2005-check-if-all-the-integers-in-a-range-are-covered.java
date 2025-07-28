class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i=left;i<=right;i++){
            boolean flag=false;
            for(int[]arr: ranges){
                if(i>=arr[0] && i<=arr[1]){
                    flag=true;
                }
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }
}