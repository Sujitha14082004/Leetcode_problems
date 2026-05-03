class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] word= sentence.split(" ");
        for(int i=0;i<word.length;i++){

            // for the first word last character
            char lastcharacter = word[i].charAt(word[i].length()-1);

            // for the second word first character
            char firstcharacter = word[(i+1)%(word.length)].charAt(0);
            
            if(firstcharacter!=lastcharacter){
                return false;
            }
        }
        return true;
    }
}