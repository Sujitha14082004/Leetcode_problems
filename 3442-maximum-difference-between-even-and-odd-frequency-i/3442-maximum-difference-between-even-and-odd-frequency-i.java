class Solution {
    public int maxDifference(String s) {
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int odd=Integer.MIN_VALUE;
        int even=Integer.MAX_VALUE;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                if(freq[i]%2!=0){
                    if(freq[i]>odd){
                        odd=freq[i];
                    }
                }
                else{
                    if(freq[i]<even){
                        even=freq[i];
                    }
                }
            }
        }
        return odd-even;
    }
}