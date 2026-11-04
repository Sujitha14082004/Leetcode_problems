class Solution {
    public String frequencySort(String s) {
        int freq[] = new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<256;i++){
             int max=0;
             char maxChar=0;
             for(int j=0;j<256;j++){
                if(freq[j]>max){
                    max = freq[j];
                    maxChar = (char)j;
                }
             }
             res.append(String.valueOf(maxChar).repeat(max));
             freq[maxChar]=0;
        }
        return res.toString();
        
    }
} 