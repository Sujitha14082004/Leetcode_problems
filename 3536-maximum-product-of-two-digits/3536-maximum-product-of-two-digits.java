class Solution {
    public int maxProduct(int n) {
        int x = n;
        List<Integer> list = new ArrayList<>();
            while(x!=0){
            int d = x%10;
            list.add(d);
            x/=10;
        }
        Collections.sort(list);
        return list.get(list.size()-1) * list.get(list.size()-2);
    }
}