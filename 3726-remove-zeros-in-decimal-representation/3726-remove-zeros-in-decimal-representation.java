class Solution {
    public long removeZeros(long n) {
        String ans=String.valueOf(n).replaceAll("0","");
        return Long.parseLong(ans);
    }
}