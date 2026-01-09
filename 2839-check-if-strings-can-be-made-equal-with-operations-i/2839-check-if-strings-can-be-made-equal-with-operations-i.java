class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] odd={s1.charAt(1),s1.charAt(3)};
        char[] odd1={s2.charAt(1),s2.charAt(3)};
        char[] even={s1.charAt(0),s1.charAt(2)};
        char[] even1={s2.charAt(0),s2.charAt(2)}; 
        Arrays.sort(odd);
        Arrays.sort(odd1);
        Arrays.sort(even);
        Arrays.sort(even1);
        return Arrays.equals(odd,odd1) && Arrays.equals(even,even1);     
    }
}