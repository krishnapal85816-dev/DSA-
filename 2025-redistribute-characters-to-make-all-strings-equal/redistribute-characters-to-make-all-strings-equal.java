class Solution {
    public boolean makeEqual(String[] words) {
        int [] frq = new int [26];
        
        for(int i=0;i<words.length;i++){
            String ch = words[i];

          for(int j = 0;j<ch.length();j++){
             char chr = ch.charAt(j);
             int idx = (int)(chr-'a');
             frq[idx] = frq[idx]+1;
          }
        }
           for(int k=0 ;k<26;k++){
             if(frq[k]%words.length !=0){
                return false;
             }
           }
        
        return true;
    }
}