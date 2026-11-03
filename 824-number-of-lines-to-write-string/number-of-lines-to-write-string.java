class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int width = widths[s.charAt(i) - 'a'];

            if (sum + width > 100) {
                lines++;
                sum = width;
            } else {
                sum += width;
            }
        }

        return new int[]{lines, sum};
    }
}