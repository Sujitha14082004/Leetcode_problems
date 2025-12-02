class Solution {
    public String reformat(String s) {
        List<Character>letter=new ArrayList<>();
        List<Character>digit=new ArrayList<>();
        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch)){
                letter.add(ch);
            }
            else{
                digit.add(ch);
            }
        }
        if(Math.abs(letter.size()-digit.size())>1){
            return "";
        }
        List<Character>first=new ArrayList<>();
        List<Character>second=new ArrayList<>();
        if(letter.size()>digit.size()){
            first=letter;
            second=digit;
        }
        else if(digit.size()>letter.size()){
            first=digit;
            second=letter;
        }
        else{
            first=letter;
            second=digit;
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(sb.length()<s.length()){
            if(sb.length()%2==0){
                sb.append(first.get(i++));
            }
            else{
                sb.append(second.get(j++));
            }
        }
        return sb.toString();
    }
}