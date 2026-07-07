class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        int sum=0;
        if(n==0){
            return 0;
        }
        while(n!=0){
            int digit=n%10;
            n/=10;
            if(digit!=0){
                sb.append(digit);
                sum+=digit;
            }
        }
        long ans=Integer.parseInt(sb.reverse().toString());
        long res=ans*sum;
        return res;
    }
}