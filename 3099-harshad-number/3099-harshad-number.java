class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0;
        int xc =x;
        while(x!=0){
            s+=x%10;
            x=x/10;
        }
        if(xc%s==0){
            return s;
        }
        return -1;
    }
}