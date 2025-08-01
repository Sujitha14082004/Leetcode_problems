class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                char ch=words[i].charAt(0);
                char ch1=words[i].charAt(1);
                if(ch==words[j].charAt(1) && ch1==words[j].charAt(0)){
                    count++;
                }
            }
        }
        return count;
    }
}