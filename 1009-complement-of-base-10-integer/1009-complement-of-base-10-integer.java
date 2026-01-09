class Solution {
    public int bitwiseComplement(int n) {
        String str=Integer.toBinaryString(n);
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                ans+='0';
            }
            else{
                ans+='1';
            }
        }
        return Integer.parseInt(ans,2);
    }
}