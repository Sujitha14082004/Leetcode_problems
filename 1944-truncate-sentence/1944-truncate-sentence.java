class Solution {
    public String truncateSentence(String s, int k) {
        String[] word=s.split(" ");
        StringBuilder result= new StringBuilder();
        for(int i=0;i<k;i++){
            result.append(word[i]+" ");
        }
        return result.toString().trim();
    }
}