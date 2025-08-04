class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> basket=new HashMap<>();
        int i=0;
        int max=0;
        for(int j=0;j<fruits.length;j++){
            basket.put(fruits[j], basket.getOrDefault(fruits[j],0)+1);
            while(basket.size()>2){
                int count=basket.get(fruits[i]);
                if(count==1){
                    basket.remove(fruits[i]);
                }
                else{
                    basket.put(fruits[i],count-1);
                }
                i++;
            }
            max=Math.max(max, j-i+1);
        }
        return max;
    }
}