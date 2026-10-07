class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
         for(char ch : s){
             sb.insert(0,ch);  
         }
         for(int i = 0;i< sb.length();i++){
             s[i] = sb.charAt(i);
         }
        
    }
}