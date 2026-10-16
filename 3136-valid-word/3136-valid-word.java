class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        int vc = 0;
        int cc = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isLetter(ch)){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vc++;
            } else {
                cc++;
            }
        }
        else if (!(Character.isDigit(ch))) {
                return false;
            }
        }
        return vc>0 && cc>0;
    }
}