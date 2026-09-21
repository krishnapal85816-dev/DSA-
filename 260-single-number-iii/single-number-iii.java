class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        // XOR all numbers
        for (int num : nums) {
            xor ^= num;
        }

        // Get rightmost set bit
        int bit = xor & -xor;

        int a = 0;
        int b = 0;

        // Divide into two groups
        for (int num : nums) {
            if ((num & bit) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[]{a, b};
    }
}