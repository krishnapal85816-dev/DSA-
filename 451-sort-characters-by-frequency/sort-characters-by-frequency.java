class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        Character[] arr = map.keySet().toArray(new Character[0]);

        Arrays.sort(arr, (a, b) -> map.get(b) - map.get(a));

        StringBuilder ans = new StringBuilder();

        for (char ch : arr) {
            ans.append(String.valueOf(ch).repeat(map.get(ch)));
        }

        return ans.toString();
    }
}