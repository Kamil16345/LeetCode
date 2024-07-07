class Solution {
    public boolean isIsomorphic(String s, String t) {
                HashMap<Character, Character> charactersMap = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (charactersMap.containsKey(s.charAt(i))) {
                stringBuilder.append(charactersMap.get(s.charAt(i)));
            } else {
                if (charactersMap.containsValue(t.charAt(i))) {
                    return false;
                }
                charactersMap.put(s.charAt(i), t.charAt(i));
                stringBuilder.append(t.charAt(i));
            }
        }
        return stringBuilder.toString().equals(t);
    }
}