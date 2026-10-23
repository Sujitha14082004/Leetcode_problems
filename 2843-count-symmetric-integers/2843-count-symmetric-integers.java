class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String str=String.valueOf(i);
            if(str.length()%2!=0){
                continue;
            }
            int half=str.length()/2;
            int sum=0;
            int sum1=0;
            for(int j=0;j<half;j++){
                sum+=str.charAt(j)-'0';
                sum1+=str.charAt(half+j)-'0';
            }
            if(sum==sum1){
                count++;
            }
        }
        return count;
    }
}