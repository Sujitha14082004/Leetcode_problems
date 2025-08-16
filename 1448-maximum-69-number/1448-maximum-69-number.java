class Solution {
    public int maximum69Number (int num) {
       String x = num + "";
       char[] y = x.toCharArray();
       for(int i=0;i<y.length;i++){
        if(y[i]=='6'){
            y[i] ='9';
            break;
        }
       }
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<y.length;i++){
        sb.append(y[i]);
       }
       String ans = sb.toString();
       return Integer.parseInt(ans);
    }
}