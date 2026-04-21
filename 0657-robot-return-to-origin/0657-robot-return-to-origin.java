class Solution {
    public boolean judgeCircle(String moves) {
        int[] ans=new int[101];
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            ans[ch]++;
        }
        return ans['U']==ans['D'] && ans['R']==ans['L'];
    }
}