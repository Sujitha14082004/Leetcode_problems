class Solution {
    public int longestSubstring(String s, int k) {
       int freq[] = new int[26];
       for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
       } 
       for(int i=0;i<s.length();i++){
        if(freq[s.charAt(i)-'a']<k){
            int left = longestSubstring(s.substring(0,i),k);
            int right = longestSubstring(s.substring(i+1,s.length()),k);
            int max = Math.max(left,right);
            return max;
        }
       }
       return s.length();
    }
}