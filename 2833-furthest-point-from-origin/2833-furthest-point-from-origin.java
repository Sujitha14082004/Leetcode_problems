class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='L' || ch=='_'){
                left--;
            }
            else{
                left++;
            }
            if(ch=='R' || ch=='_'){
                right++;
            }
            else{
                right--;
            }
        }
        return Math.max(Math.abs(left),Math.abs(right));
    }
}