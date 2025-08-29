class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        Stack<Integer>parentheses=new Stack<>();
        parentheses.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                parentheses.push(i);
            }
            else{
                parentheses.pop();
                if(parentheses.isEmpty()){
                    parentheses.push(i);
                }
                else{
                    max=Math.max(max,i-parentheses.peek());
                }
            }
        }
        return max;
    }
}