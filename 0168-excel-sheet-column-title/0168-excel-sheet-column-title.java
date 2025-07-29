class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder num=new StringBuilder();
       while(columnNumber>0){
        columnNumber--;
        int rem = columnNumber%26;
        num.append((char)('A'+rem));
        columnNumber = columnNumber/26;
       }
       return num.reverse().toString(); 
    }
}