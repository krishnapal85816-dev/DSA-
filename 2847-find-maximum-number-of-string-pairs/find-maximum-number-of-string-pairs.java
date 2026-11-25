
import java.util.*;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String rev = "" + word.charAt(1) + word.charAt(0);

            if (set.contains(rev)) {
                count++;
            } else {
                set.add(word);
            }
        }

        return count;
    }
}
