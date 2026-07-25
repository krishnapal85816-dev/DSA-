class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }

    StringBuilder sb = new StringBuilder("");

    for(int i =0;i<s.length();i++){
        char ch = s.charAt(i);

        if(ch>='a'&& ch<='z'){
            sb.append(ch);
        }
        if(ch>='A'&& ch<='Z'){
            ch = (char)(ch-'A'+'a');
            sb.append(ch);
        }
        if(ch>='0'&& ch<='9'){
            sb.append(ch);
        }
    }
    int st=0;
    int ed= sb.length()-1;
    while(st<ed){
        char sChar = sb.charAt(st);
         char eChar = sb.charAt(ed);
        if(sChar != eChar){
            return false;
        }
        st++;
        ed--;
    }
    return true;
        
    }
}