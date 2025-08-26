class Solution {
    public int largestAltitude(int[] gain) {
        List<Integer>list=new ArrayList<>();
        int max=0;
        int high=0;
        list.add(high);
        for(int i=0;i<gain.length;i++){
            high=high+gain[i];
            list.add(high);
        }
        max=Collections.max(list);
        return max;
    }
}