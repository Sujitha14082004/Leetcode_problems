class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    int ans=nums[i][j];
                    if(ans>1){
                        boolean res=true;
                        for(int k=2;k*k<=ans;k++){
                            if(ans%k==0){
                                res=false;
                                break;
                            }
                        }
                        if(res && ans>max){
                            max=ans;
                        }
                    }
                }
            }
        }
        return max;
    }
}