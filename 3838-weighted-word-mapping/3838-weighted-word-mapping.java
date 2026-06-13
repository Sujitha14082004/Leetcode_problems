class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        String alp = "abcdefghijklmnopqrstuvwxyz";
        int a = 0;
        for(char ch : alp.toCharArray()){
            map.put(ch, weights[a]);
            a++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            int sum = 0;
            String x = words[i];
            for(int j=0;j<x.length();j++){
               if(map.containsKey(x.charAt(j))){
                sum = sum + map.get(x.charAt(j));
               }
            }
            list.add(sum%26);
            //System.out.println(sum);
        }
        String rev = "zyxwvutsrqponmlkjihgfedcba";
        int b = 0;
        Map<Integer, Character> map2 = new LinkedHashMap<>();
        for(int i=0;i<rev.length();i++){
            map2.put(b, rev.charAt(i));
            b++;
        }
        String ans = "";
        for(int i=0;i<list.size();i++){
            if(map2.containsKey(list.get(i))){
                ans = ans + map2.get(list.get(i));
            }
        }
        //System.out.print(ans);
        return ans;
    }
}