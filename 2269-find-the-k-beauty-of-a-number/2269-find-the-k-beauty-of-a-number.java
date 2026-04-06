class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int count=0;
        for(int i=0;i<=s.length()-k;i++){
            String s1=s.substring(i, i+k);
            int ans=Integer.parseInt(s1);
            if(ans!=0 && num%ans==0){
                count++;
            }
        }
        return count;
    }
}