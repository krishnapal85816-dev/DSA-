
class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr = new String[m];

        for (int i = 0; i < m; i++) {
            char[] row = new char[n];

            for (int j = 0; j < n; j++) {
                if (j == 0 || i == m - 1) {
                    row[j] = '.';
                } else {
                    row[j] = '#';
                }
            }

            arr[i] = new String(row);
        }

        return arr;
    }
}
