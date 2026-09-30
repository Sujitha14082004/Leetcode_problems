class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int freq[] = new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        boolean b = false;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0) continue;
            if(isPrime(freq[i])){
                b = true;
                break;
            }
        }
        if(b) return true;
        return false;
    }
    public static boolean isPrime(int x){
        if(x<2) return false;
        int c =  0;
        for(int i=1; i<=(x);i++){
            if(x%i==0){
                c++;
                
            }
        }
        if(c==2){
            return true;
        }
        return false;
    }
}