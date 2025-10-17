class Solution {
    public int arrangeCoins(int n) {
        int index=0;
        for(int i=1;i<=n;i++){
            n=n-i;
            index++;
        }
        return index;
    }
}