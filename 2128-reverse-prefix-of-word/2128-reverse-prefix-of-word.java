class Solution {
    public String reversePrefix(String word, char ch) {

        //find the index of character
        int index = word.indexOf(ch);
        
        //if the character is not found
        if(index==-1){
            return word;
        }
        StringBuilder prefix = new StringBuilder (word.substring(0,index+1));

        //reverse the prefix
        prefix.reverse();

        //append the reversed character and the remaining character
        word = prefix.toString()+word.substring(index+1);
        return word;
    }
}