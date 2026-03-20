class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int max=0;
        int[]ans=new int[101];
        for(int i=lowLimit;i<=highLimit;i++){
            int n=i;
            int sum=0;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            ans[sum]++;
            max=Math.max(max,ans[sum]);
        }
        return max;
    }
}