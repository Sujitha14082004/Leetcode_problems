class Solution {
    public String largestGoodInteger(String num) {
        char x = ' ';
        for(int i=0; i<=num.length()-3; i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                if(num.charAt(i)>x){
                    x = num.charAt(i);
                }
            }
        }
        if(x == ' '){
            return "";
        }
        return "" + x + x + x;
    }
}