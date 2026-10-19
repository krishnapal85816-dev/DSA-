import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reformat(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        
        // Step 1: Separate letters and digits
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            } else {
                letters.add(c);
            }
        }
        
        // Step 2: Check if reformatting is possible
        if (Math.abs(letters.size() - digits.size()) > 1) {
            return "";
        }
        
        // Step 3: Interleave characters starting with the larger group
        StringBuilder result = new StringBuilder();
        boolean nextIsLetter = letters.size() >= digits.size();
        
        int lIdx = 0, dIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (nextIsLetter) {
                result.append(letters.get(lIdx++));
            } else {
                result.append(digits.get(dIdx++));
            }
            // Alternate the type for the next index
            nextIsLetter = !nextIsLetter;
        }
        
        return result.toString();
    }
}