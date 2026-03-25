class Solution {
    public int smallestNumber(int n) {
        int r=1;
        while(r<n){
            r=r*2+1;
        }
        return r;
    }
}