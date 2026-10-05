class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (sMap[a] != tMap[b]) {
                return false;
            }

            sMap[a] = i + 1;
            tMap[b] = i + 1;
        }

        return true;
    }
}