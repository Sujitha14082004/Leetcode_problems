class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='1'){
                        max=Math.max(max,j-i);
                        break;
                    }
                }
            }
        }
        return max;
    }
}