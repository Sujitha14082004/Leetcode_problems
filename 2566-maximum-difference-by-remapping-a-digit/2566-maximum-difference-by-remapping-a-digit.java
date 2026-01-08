class Solution {
    public int minMaxDifference(int num) {
        String s=String.valueOf(num);
        int max=0;
        int min=Integer.MAX_VALUE;
        for(char ch1='0';ch1<='9';ch1++){
            for(char ch2='0';ch2<='9';ch2++){
                String str=s.replace(ch1,ch2);
                int ans=Integer.parseInt(str);
                max=Math.max(max,ans);
                min=Math.min(min,ans);
            }
        }
        return max-min;
    }
}