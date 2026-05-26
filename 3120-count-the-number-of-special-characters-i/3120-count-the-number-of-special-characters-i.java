class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();

        for (int i=0;i<word.length();i++) {
            char c = word.charAt(i);
            set.add(c);
        }
        int count = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (set.contains(c) && set.contains(Character.toUpperCase(c))) {
                count++;
            }
        }
        return count;
    }
}