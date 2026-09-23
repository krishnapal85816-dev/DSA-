import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums[0].length; i++) {

            int num = nums[0][i];
            boolean present = true;

            for (int j = 1; j < nums.length; j++) {

                boolean found = false;

                for (int k = 0; k < nums[j].length; k++) {

                    if (num == nums[j][k]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    present = false;
                    break;
                }
            }

            if (present) {
                list.add(num);
            }
        }

        Collections.sort(list);

        return list;
    }
}
