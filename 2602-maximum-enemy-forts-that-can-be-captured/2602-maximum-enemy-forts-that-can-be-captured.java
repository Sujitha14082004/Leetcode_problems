class Solution {
    public int captureForts(int[] forts) {
        int count=0;
        for(int i=0;i<forts.length;i++){
            if(forts[i]==1){
                for(int j=0;j<forts.length;j++){
                    if(forts[j]==-1){
                       int left=Math.min(i,j);
                       int right=Math.max(i,j);
                       boolean found=true;
                       int zero=0;
                       for(int k=left+1;k<right;k++){
                        if(forts[k]!=0){
                            found=false;
                            break;
                        }
                        zero++;
                       }
                       if(found){
                        count=Math.max(count,zero);
                       }
                    }
                }
            }
        }
        return count;
    }
}


