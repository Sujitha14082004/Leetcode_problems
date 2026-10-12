class Solution {
    public long distributeCandies(int n, int limit) {
        long count=0;
        if(limit>=n){
            return (long)(n+2)*(n+1)/2;
        }
        for(int i=0;i<=limit;i++){
            int rem=n-i;
            if(rem<0){
                break;
            }
            int max=Math.min(limit,rem);
            int min=Math.max(0,rem-limit);
            if(min<=max){
                count+=(max-min+1);
            }
        }
        return count;
    }
}