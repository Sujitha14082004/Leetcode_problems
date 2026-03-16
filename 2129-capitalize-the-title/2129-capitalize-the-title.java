class Solution {
    public String capitalizeTitle(String title) {
        String[] ans=title.split(" ");
        for(int i=0;i<ans.length;i++){
            if(ans[i].length()<=2){
                ans[i]=ans[i].toLowerCase();
            }
            else{
                ans[i]=ans[i].substring(0,1).toUpperCase()+ans[i].substring(1).toLowerCase();
            }
        }
        String res=ans[0];
        for(int i=0;i<ans.length;i++){
            if(i>0){
                res+=" ";
                res+=ans[i];
            }
        }
        return res;
        //         OR
        // return String.join(" ",ans);
    }
}