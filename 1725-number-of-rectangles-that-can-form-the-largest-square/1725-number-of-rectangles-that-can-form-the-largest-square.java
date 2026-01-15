class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max=0;
        int count=0;
        for(int i=0;i<rectangles.length;i++){
            int ans=Math.min(rectangles[i][0],rectangles[i][1]);
            if(ans>max){
                max=ans;
                count=1;
            }
            else if(ans==max){
                count++;
            }
        }
        return count;
    }
}