class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int ans=0;
        while(n!=0){
            int digit=n%10;
            ans=ans*10+digit;;
            n/=10;
        }
        return (Math.abs(num-ans));
    }
}