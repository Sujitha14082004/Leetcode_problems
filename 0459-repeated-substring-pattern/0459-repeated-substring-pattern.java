class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<=s.length()/2;i++){
            if(s.length()%i!=0){
                continue;
            }
            boolean found=true;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)!=s.charAt(j%i)){
                    found=false;
                    break;
                }
            }
            if(found){
                return true;
            }
        }
        return false;
    }
}