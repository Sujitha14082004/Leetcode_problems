class Solution {
    public int characterReplacement(String s, int k) {
        int[]frequency = new int[26];
        int left = 0;
        int maxwindow =0;
        int maxfrequency = 0;
        for(int right=0;right<s.length();right++){

            //frequency of the current character
            frequency[s.charAt(right)-'A']++;

            //update maximum frequency
            maxfrequency = Math.max(maxfrequency, frequency[s.charAt(right)-'A']);
            int windowlength = right-left+1;
            
            //windowlength maximum than k reduce windowsize and move the left pointer
            if(windowlength-maxfrequency>k){
                frequency[s.charAt(left)-'A']--;
                left++;
            }
            windowlength = right-left+1;
            maxwindow = Math.max(maxwindow,windowlength);
        }
        return maxwindow;
    }
}