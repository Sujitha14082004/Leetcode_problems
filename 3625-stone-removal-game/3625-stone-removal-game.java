class Solution {
    public boolean canAliceWin(int n) {
        int removing=10;
        int stone=0;
        while(n>=removing){
            n=n-removing;
            removing=removing-1;
            stone=stone+1;
        }
        return (stone%2!=0);
    }
}