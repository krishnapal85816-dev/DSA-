
import java.util.*;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();

        int i = 1;

        while (list.size() < k) {
            if (!set.contains(i)) {
                list.add(i);
            }
            i++;
        }

        return list.get(k - 1);
    }
}
