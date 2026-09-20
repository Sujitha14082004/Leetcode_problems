class Solution {
    public int reverseDegree(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            max += (i+1) * ( 97 - (int)s.charAt(i) + 26);
        }
        return max;
    }
}