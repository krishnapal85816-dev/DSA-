class Solution {
    public char findTheDifference(String s, String t) {
         int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
         for (char ch : t.toCharArray()) {
            freq[ch - 'a']--;
        }
        for (int i = 0; i < t.length(); i++) {
            if (freq[t.charAt(i) - 'a'] == -1) {
                return t.charAt(i);
            }
        }
        char dead = t.charAt(0);
        return dead;

        
    }
}