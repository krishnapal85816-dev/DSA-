
import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        int j = 0;

        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
            if (j < nums.length && nums[j] == i) {
                j++;
            } else {
                list.add(i);
            }
        }

        return list;
    }
}
