class Solution {
    public boolean kLengthApart(int[] arr, int k) {
        int prev = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (prev != -1 && i - prev - 1 < k) {
                    return false;
                }

                prev = i;
            }
        }

        return true;
    }
}