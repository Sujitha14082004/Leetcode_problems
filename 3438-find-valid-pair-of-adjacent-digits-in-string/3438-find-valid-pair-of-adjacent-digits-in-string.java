class Solution {
    public String findValidPair(String s) {
        int[]freq=new int[201];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'0']++;
        }
        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1!=ch2){
                int a=ch1-'0';
                int b=ch2-'0';
                if(freq[a]==a && freq[b]==b){
                    return ""+ch1+ch2;
                }
            }
        }
        return "";
    }
}