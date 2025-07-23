class Solution {
    public int maxPower(String s) {
        int max=1;
        int currentmax=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currentmax++;
                max = Math.max(currentmax,max);
            }
            else{
                currentmax=1;
            }
        }
        return max;
    }
}