class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                count[word.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] % words.length != 0)
                return false;
        }

        return true;
    }
}