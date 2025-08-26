class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int high=0;
        for(int i=0;i<gain.length;i++){
            high=high+gain[i];
            if(high>max){
                max=high;
            }
        }
        return max;
    }
}