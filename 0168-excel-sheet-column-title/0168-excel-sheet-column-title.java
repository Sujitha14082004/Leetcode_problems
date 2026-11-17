class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            n = n - 1;
            int rem = n%26;
            sb.append((char)('A'+rem));
            n = n/26;
        }
        return sb.reverse().toString();
    }
}