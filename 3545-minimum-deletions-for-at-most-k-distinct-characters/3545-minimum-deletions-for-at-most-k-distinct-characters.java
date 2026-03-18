class Solution {
    public int minDeletion(String s, int k) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                list.add(freq[i]);
            }
        }
        if(list.size()<=k){
            return 0;
        }
        Collections.sort(list);
        int deletions=0;
        int count=list.size()-k;
        for(int i=0;i<count;i++){
            deletions+=list.get(i);
        }
        return deletions;
    }
}