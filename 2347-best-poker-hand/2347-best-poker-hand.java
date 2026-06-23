class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean found=true;
        for(int i=1;i<suits.length;i++){
            if(suits[i]!=suits[0]){
                found=false;
                break;
            }
        }
        if(found){
            return "Flush";
        }
        int rank[]=new int[14];
        for(int i=0;i<ranks.length;i++){
            rank[ranks[i]]++;
        }
        for(int i=1;i<=13;i++){
            if(rank[i]>=3){
                return "Three of a Kind";
            }
        }
        for(int i=1;i<=13;i++){
            if(rank[i]==2){
                return "Pair";
            }
        }
        return "High Card";
    }
}