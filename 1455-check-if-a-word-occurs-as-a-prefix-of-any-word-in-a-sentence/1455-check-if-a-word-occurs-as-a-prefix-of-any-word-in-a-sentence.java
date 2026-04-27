class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[]words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.length()>=searchWord.length()){
                boolean found=true;
                for(int j=0;j<searchWord.length();j++){
                    if(word.charAt(j)!=searchWord.charAt(j)){
                        found=false;
                        break;
                    }
                }
                if(found){
                    return i+1;
                }
            }
        }
        return -1;
    }
}