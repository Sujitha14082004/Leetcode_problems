class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=0;
        int total=0;
        while(numBottles>0){
            numBottles--;
            empty++;
            total++;
            if(empty==numExchange){
                empty=0;
                numBottles++;
            }
        }
        return total;
    }
}