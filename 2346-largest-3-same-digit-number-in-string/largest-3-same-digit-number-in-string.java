class Solution {
    public String largestGoodInteger(String num) {
        String []arr = {"999","888" ,"777","666","555","444","333","222","111","000"};
        for(String st : arr){
            if(num.contains(st)){
                return st;

            }
        }
        return "";
    }
}