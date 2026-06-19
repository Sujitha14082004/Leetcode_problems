class Solution {
    public int largestAltitude(int[] gain) {
        int arr[] = new int[gain.length+1];
        arr[0] = 0;
        int s = 0;
        int p = 1;
        for(int i=0;i<gain.length;i++){
            s = s + gain[i];
            arr[p++] = s;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}