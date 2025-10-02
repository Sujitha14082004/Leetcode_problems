class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty=0;
        int total=0;
        while(numBottles>0){
            total+=numBottles;
            empty+=numBottles;
            numBottles=0;
            if(empty>=numExchange){
                empty-=numExchange;
                numBottles=1;
                numExchange++;
            }
            else{
                break;
            }
        }
        return total;
    }
}