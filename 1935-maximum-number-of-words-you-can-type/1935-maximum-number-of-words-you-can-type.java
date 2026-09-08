class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        for(String str: text.split(" ")){
            int i=0;
            while(i<str.length()){
                if(brokenLetters.indexOf(str.charAt(i))!=-1){
                    break;
                }
                i++;
            }
            if(i==str.length()){
                count++;
            }
        }
        return count;
    }
}