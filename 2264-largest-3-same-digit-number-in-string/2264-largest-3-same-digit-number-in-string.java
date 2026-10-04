class Solution {
    public String largestGoodInteger(String num) {
        String result="";
        for(int i=0;i<=num.length()-3;i++){
            char ch=num.charAt(i);
            if(ch==num.charAt(i+1)&&num.charAt(i+1)==num.charAt(i+2)){
                String ans=""+ch+ch+ch;
                if(result.equals("")||ans.compareTo(result)>0){
                    result=ans;
                }
            }
        }
        return result;
    }
}