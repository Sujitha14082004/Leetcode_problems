class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if(n<=k && m<=k){
            return 0;
        }
        long min=Long.MAX_VALUE;
        if(n>k){
            for(int i=1;i<n;i++){
                long part=i;
                long part1=n-i;
                long cost=part*part1;
                if(part<=k && part1<=k){
                    min=Math.min(min,cost);
                }
            }
        }
        if(m>k){
            for(int i=1;i<m;i++){
                long part=i;
                long part1=m-i;
                long cost=part*part1;
                if(part<=k && part1<=k){
                    min=Math.min(min,cost);
                }
            }
        }
        return min;
    }
}