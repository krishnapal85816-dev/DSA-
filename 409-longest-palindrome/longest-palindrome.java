class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        int count = 0;
        boolean odd = false;

        for (char ch : s.toCharArray()) {
            arr[ch]++;
        }

        for (int freq : arr) {
            count += (freq / 2) * 2;

            if (freq % 2 != 0) {
                odd = true;
            }
        }

        if (odd) {
            count++;
        }

        return count;
    }
}