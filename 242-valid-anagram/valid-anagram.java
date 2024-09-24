class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (Character ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                Integer integer = map.get(ch);
                integer++;
                map.put(ch, integer);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character ch : t.toCharArray()) {
            if (map.containsKey(ch)) {
                Integer integer = map.get(ch);
                integer--;
                map.put(ch, integer);
                if (integer == 0) {
                    map.remove(ch);
                }
            }
        }
        return map.size() <= 0;
    }
}