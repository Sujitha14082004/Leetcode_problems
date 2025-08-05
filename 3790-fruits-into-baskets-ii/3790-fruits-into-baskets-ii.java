class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced=0;
        for(int i=0;i<fruits.length;i++){
            boolean fruitplaced=false;
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=-1;   // fruit placed in a basket
                    fruitplaced=true;
                    break; // after fruit placed it will exit the loop
                }
            }
            if(!fruitplaced){
                unplaced++;   // fruit not placed
            }
        }
        return unplaced;
    }
}