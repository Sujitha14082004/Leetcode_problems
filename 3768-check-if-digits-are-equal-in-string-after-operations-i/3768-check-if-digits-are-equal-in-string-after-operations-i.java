class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String ans="";
            for(int i=0;i<s.length()-1;i++){
                ans=ans+(s.charAt(i)+s.charAt(i+1))%10;
            }
            s=ans;
        }
        return s.charAt(0)==s.charAt(1);
    }
}