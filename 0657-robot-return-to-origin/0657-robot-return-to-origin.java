class Solution {
    public boolean judgeCircle(String moves) {
        int a=0;
        int b=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                a++;
            }
            else if(ch=='D'){
                a--;
            }
            else if(ch=='R'){
                b++;
            }
            else if(ch=='L'){
                b--;
            }
        }
        return a==0 && b==0;
    }
}