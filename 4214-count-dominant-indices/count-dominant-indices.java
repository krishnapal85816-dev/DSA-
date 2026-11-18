
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        long sum = nums[n - 1];
        int count = 0;

        for (int i = n - 2; i >= 0; i--) {
            int elements = n - i - 1;

            if ((long) nums[i] * elements > sum) {
                count++;
            }

            sum += nums[i];
        }

        return count;
    }
}
