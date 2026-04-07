class Solution {
    public int residuePrefixes(String s) {
        int count=0;
        int[]freq=new int[26];
        int unique=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==0){
                unique++;
            }
            freq[ch-'a']++;
            int length=i+1;
            if(unique==length%3){
                count++;
            }
        }
        return count;
    }
}