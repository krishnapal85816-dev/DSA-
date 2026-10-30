class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] freq = new int[1001];

        for (int num : target) {
            freq[num]++;
        }

        for (int num : arr) {
            if (--freq[num] < 0) {
                return false;
            }
        }

        return true;
    }
}