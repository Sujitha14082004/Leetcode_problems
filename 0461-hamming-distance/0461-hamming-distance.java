class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        String str=Integer.toBinaryString(x);
        String str1=Integer.toBinaryString(y);
        while(str.length()<str1.length()){
            str="0"+str;
        }
        while(str1.length()<str.length()){
            str1="0"+str1;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str1.charAt(i)){
                count++;
            }
        }
        return count;
    }
}