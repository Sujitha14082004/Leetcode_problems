class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            Map<Character,Integer> mp1 = new HashMap<>();
            Map<Character,Integer> mp2 = new HashMap<>();
            String word = words[i];
            boolean b = true;
            for(int j=0;j<word.length();j++){
                char c = word.charAt(j);
                char p = pattern.charAt(j);
                if(!mp1.containsKey(c)){
                    mp1.put(c, j);
                }
                if(!mp2.containsKey(p)){
                    mp2.put(p, j);
                }
                if(!mp1.get(c).equals(mp2.get(p))){
                    b = false;
                    break;
                }
            }
            if(b){
                list.add(word);
            }
        }
       return list;
    }
}