class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        //splitting to arrays
        int w[] = new int[matches.length];
        int l[] = new int[matches.length];
        for(int i=0;i<w.length;i++){
            w[i] = matches[i][0];
            l[i] = matches[i][1];
        }
        //freq array consists of count of winning and losing teams
        int freq_w [] = new int[100001];
        for(int i=0;i<w.length;i++){
            freq_w[w[i]]++;
        }
        int freq_l [] = new int [100001];
        for(int i=0;i<l.length;i++){
            freq_l[l[i]]++;
        }
        List <Integer> w1 = new ArrayList<>();
        List <Integer> l1 = new ArrayList<>();
        //result
        for(int i=0;i<freq_w.length;i++){
            if(freq_w[i]!=0 && freq_l[i]==0){
                w1.add(i);
            }
            if(freq_l[i]==1){
                l1.add(i);
            }
        }
        list.add(w1);
        list.add(l1);
        return list;
    }
}