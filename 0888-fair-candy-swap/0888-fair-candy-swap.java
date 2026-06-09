class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum=0;
        for(int i=0;i<aliceSizes.length;i++){
            sum+=aliceSizes[i];
        }
        int sum1=0;
        for(int i=0;i<bobSizes.length;i++){
            sum1+=bobSizes[i];
        }
        int diff=(sum-sum1)/2;
        Set<Integer>set= new HashSet<>();
        for(int i=0;i<bobSizes.length;i++){
            set.add(bobSizes[i]);
        }
        for(int i=0;i<aliceSizes.length;i++){
            int ans=aliceSizes[i];
            int ans1=ans-diff;
            if(set.contains(ans1)){
                return new int[]{ans,ans1};
            }
        }
        return new int[] {};
    }
}