class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            int a=i;
            int b=i;
            while(a>=0 && b<s.length() && s.charAt(a)==s.charAt(b)){
                a--;
                b++;
            }
            String res= s.substring(a+1,b);
            if(res.length()>ans.length()){
                ans = res;
            }
            a=i;
            b=i+1;
            while(a>=0 && b<s.length() && s.charAt(a)==s.charAt(b)){
                a--;
                b++;
            }
            res= s.substring(a+1,b);
            if(res.length()>ans.length()){
                ans = res;
            }
        }
        return ans;
    }
}