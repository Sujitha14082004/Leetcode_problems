class Solution {
    public String convertDateToBinary(String date) {
        String[] d = date.split("-");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<d.length-1; i++){
            int x = Integer.parseInt(d[i]);
            String y = Integer.toBinaryString(x);
            sb.append(y);
            sb.append("-");
        }
       int xc = Integer.parseInt(d[d.length-1]);
       String y = Integer.toBinaryString(xc);
       sb.append(y);
       return sb.toString();
    }
}