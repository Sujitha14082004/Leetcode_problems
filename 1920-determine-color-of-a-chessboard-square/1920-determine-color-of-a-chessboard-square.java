class Solution {
    public boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        char digit = coordinates.charAt(1);
        int row = letter-'a';
        int column = digit-'1';
        return (row+column)%2!=0;
    }
}