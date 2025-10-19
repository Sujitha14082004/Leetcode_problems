class Solution {
    public int maximumPopulation(int[][] logs) {
        int year=1950;
        int count=0;
        for(int i=1950;i<=2050;i++){
            int count1=0;
            for(int j=0;j<logs.length;j++){
                int birth=logs[j][0];
                int death=logs[j][1];
                if(birth<=i && death>i){
                    count1++;
                }
            }
            if(count1>count){
                count=count1;
                year=i;
            }
        }
        return year;
    }
}