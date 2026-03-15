class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder();
        boolean found=true;
        for(int i=s.length()-1;i>=0;i--){
            if(found && (s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')){
                continue;
            }
            else{
                found=false;
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}