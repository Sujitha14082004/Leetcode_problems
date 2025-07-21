class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        int n=colors.length;
        for(int i=0;i<colors.length;i++){
            int left = colors[(i-1+n)%n];
            int middle = colors[i];
            int right = colors[(i+1+n)%n];
            if(middle!=left && middle!=right){
                count++;
            }
        }
        return count;
    }
}