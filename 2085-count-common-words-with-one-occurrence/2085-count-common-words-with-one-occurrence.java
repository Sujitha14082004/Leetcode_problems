class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        for(int i=0;i<words1.length;i++){
            int freq1=0;
            int freq2=0;
            for(int j=0;j<words1.length;j++){
                if(words1[i].equals(words1[j])){
                    freq1++;
                }
            }
            for(int j=0;j<words2.length;j++){
                if(words1[i].equals(words2[j])){
                    freq2++;
                }
            }
            if(freq1==1 && freq2==1){
                count++;
            }
        }
        return count;
    }
}