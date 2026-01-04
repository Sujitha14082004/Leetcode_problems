class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            int sum=0;
            for(int j=1;j*j<=num;j++){
                if(num%j==0){
                    int divisor=j;
                    int divisor1=num/j;
                    if(divisor==divisor1){
                        count++;
                        sum+=divisor1;
                    }
                    else{
                        count+=2;
                        sum+=divisor+divisor1;
                    }
                }
                if(count>4){
                    break;
                }
            }
            if(count==4){
                ans+=sum;
            }
        }
        return ans;
    }
}