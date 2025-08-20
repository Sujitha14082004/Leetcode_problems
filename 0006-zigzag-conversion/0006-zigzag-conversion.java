class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder zigzag = new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=(2*(numRows-1))){
                zigzag.append(s.charAt(j));
                int diagonal =  j + (2 * (numRows - 1) - 2 * i);
                if (i != 0 && i != numRows - 1 && diagonal < s.length()) {
                    zigzag.append(s.charAt(diagonal));
                }
            }
        }
        return zigzag.toString();
    }
}