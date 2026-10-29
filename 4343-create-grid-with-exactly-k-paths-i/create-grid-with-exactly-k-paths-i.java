
class Solution {
    public String[] createGrid(int m, int n, int k) {
        int r, c;
        String[] pattern;

        if (k == 1) {
            r = 1;
            c = 1;
            pattern = new String[]{"."};
        } else if (m >= 2 && n >= k) {
            r = 2;
            c = k;
            pattern = new String[r];

            for (int i = 0; i < r; i++) {
                pattern[i] = ".".repeat(c);
            }
        } else if (m >= k && n >= 2) {
            r = k;
            c = 2;
            pattern = new String[r];

            for (int i = 0; i < r; i++) {
                pattern[i] = "..";
            }
        } else if (k == 4 && m >= 3 && n >= 3) {
            r = 3;
            c = 3;
            pattern = new String[]{"..#", "...", "#.."};
        } else {
            return new String[0];
        }

        char[][] grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '#';
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = pattern[i].charAt(j);
            }
        }

        for (int j = c; j < n; j++) {
            grid[r - 1][j] = '.';
        }

        for (int i = r; i < m; i++) {
            grid[i][n - 1] = '.';
        }

        String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            ans[i] = new String(grid[i]);
        }

        return ans;
    }
}
