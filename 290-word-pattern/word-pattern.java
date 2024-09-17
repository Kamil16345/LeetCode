class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> maps = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();
        if (pattern.length() != s.split(" ").length) {
            return false;
        }
        String[] words = s.split(" ");
        for (int i = 0; i < pattern.length(); i++) {
            if (maps.containsKey(pattern.charAt(i))) {
                if (!maps.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                if (usedWords.contains(words[i])) {
                    return false;
                }
                usedWords.add(words[i]);
                maps.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
    }
}