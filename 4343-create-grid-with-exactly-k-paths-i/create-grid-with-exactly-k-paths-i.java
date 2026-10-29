
class Solution {
    public String[] createGrid(int m, int n, int k) {
        String[] pattern;
        int r, c;

        if (k == 1) {
            pattern = new String[]{"."};
        } 
        else if (k == 2) {
            if (m < 2 || n < 2) return new String[0];
            pattern = new String[]{"..", ".."};
        } 
        else if (k == 3) {
            if (m >= 2 && n >= 3) {
                pattern = new String[]{"...", "..."};
            } else if (m >= 3 && n >= 2) {
                pattern = new String[]{"..", "..", ".."};
            } else {
                return new String[0];
            }
        } 
        else {
            if (m >= 2 && n >= 4) {
                pattern = new String[]{"....", "...."};
            } else if (m >= 4 && n >= 2) {
                pattern = new String[]{"..", "..", "..", ".."};
            } else if (m >= 3 && n >= 3) {
                pattern = new String[]{"..#", "...", "#.."};
            } else {
                return new String[0];
            }
        }

        r = pattern.length;
        c = pattern[0].length();

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
