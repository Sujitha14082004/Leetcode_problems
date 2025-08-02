class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> count = new HashMap<>();

        // Count frequency differences between both baskets
        for (int i = 0; i < basket1.length; i++) {
            count.put(basket1[i], count.getOrDefault(basket1[i], 0) + 1);
            count.put(basket2[i], count.getOrDefault(basket2[i], 0) - 1);
        }

        List<Integer> extra = new ArrayList<>();
        int minVal = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int val = entry.getKey(); 
            int freq = entry.getValue();
            minVal = Math.min(minVal, val);

            // If frequency is odd, impossible to balance
            if (freq % 2 != 0){
                return -1;
            }

            // Add half the excess values to swap list
            for (int i = 0; i < Math.abs(freq) / 2; i++) {
                extra.add(val);
            }
        }

        // Only need to process half of swaps
        Collections.sort(extra);
        long cost = 0;
        for (int i = 0; i < extra.size() / 2; i++) {
            cost += Math.min(2*minVal, extra.get(i));
        }

        return cost;
    }
}
