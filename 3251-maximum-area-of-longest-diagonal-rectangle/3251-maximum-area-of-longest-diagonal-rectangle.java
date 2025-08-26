class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxlength=0;
        int maxarea=0;
        for(int i=0;i<dimensions.length;i++){
            int length=dimensions[i][0];
            int width=dimensions[i][1];
            int diagonal=((length*length)+(width*width));
            int area=length*width;
            if(diagonal>maxlength){
                maxlength=diagonal;
                maxarea=area;
            }
            else if(diagonal==maxlength){
                if(area>maxarea){
                    maxarea=area;
                }
            }
        }
        return maxarea;
    }
}