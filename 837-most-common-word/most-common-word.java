
import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        String result = "";
        int max = 0;

        for (String word : words) {
            if (!ban.contains(word)) {
                int count = map.getOrDefault(word, 0) + 1;
                map.put(word, count);

                if (count > max) {
                    max = count;
                    result = word;
                }
            }
        }

        return result;
    }
}
