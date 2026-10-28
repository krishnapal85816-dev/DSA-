
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] broken = new boolean[26];

        for (char ch : brokenLetters.toCharArray()) {
            broken[ch - 'a'] = true;
        }

        int count = 0;

        for (String word : text.split(" ")) {
            boolean canType = true;

            for (char ch : word.toCharArray()) {
                if (broken[ch - 'a']) {
                    canType = false;
                    break;
                }
            }

            if (canType) {
                count++;
            }
        }

        return count;
    }
}
