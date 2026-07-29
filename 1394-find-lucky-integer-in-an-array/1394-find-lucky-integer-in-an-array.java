class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i : arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        int c=-1;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(key == value){
                c = Math.max(c, value);
            }
        }
        return c;
    }
}