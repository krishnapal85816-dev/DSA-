class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String temp = s + s;
        return temp.substring(1, temp.length() - 1).contains(s);
    }
}