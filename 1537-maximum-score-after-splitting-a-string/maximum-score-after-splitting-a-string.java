class Solution {
    public int maxScore(String s) {
        int zeros = 0;
        int ones = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                ones++;
            }
        }

        int maxScore = 0;
        int leftZeros = 0;
        int rightOnes = ones;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }

            maxScore = Math.max(maxScore, leftZeros + rightOnes);
        }

        return maxScore;
    }
}