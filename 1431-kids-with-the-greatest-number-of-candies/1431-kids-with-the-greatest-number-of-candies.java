class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies = Integer.MIN_VALUE;;
        for(int i=0;i<candies.length;i++){
            //maxcandies = Math.max(maxcandies,candies[i]);
            if(candies[i]>maxcandies){
                maxcandies = candies[i];
            }
        }
            List<Boolean> ans = new ArrayList<>();
            for(int i=0;i<candies.length;i++){
                if(candies[i]+extraCandies >= maxcandies){
                    ans.add(true);
                }
                else{
                    ans.add(false);
                }
            }
            return ans;
    }
}