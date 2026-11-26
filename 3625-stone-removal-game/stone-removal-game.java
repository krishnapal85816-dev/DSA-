class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int buc=n;
       int rm =10;
        boolean iswin = false;
        while(buc>=rm){
            buc=buc-rm;
            iswin =!iswin;
            rm--;
         }
         return iswin;
    }
}