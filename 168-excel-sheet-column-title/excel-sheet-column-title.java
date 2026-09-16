class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";

        while (columnNumber > 0) {
            char c = (char) ('A' + (columnNumber - 1) % 26);
            ans = c + ans;
            columnNumber = (columnNumber - 1) / 26;
        }

        return ans;
    }
}
