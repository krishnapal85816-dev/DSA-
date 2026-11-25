class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2) {
            return -1;
        }

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if((a > b && a < c) || (a < b && a > c)) {
            return a;
        }

        if((b > a && b < c) || (b < a && b > c)) {
            return b;
        }

        return c;
    }
}