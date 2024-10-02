class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        char prevChar;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == s.length() - 1) {
                result = map.get(s.charAt(i));
            } else {
                prevChar = s.charAt(i + 1);
                if (map.get(s.charAt(i)) >= map.get(prevChar)) {
                    result += map.get(s.charAt(i));
                } else {
                    result -= map.get(s.charAt(i));
                }
            }
        }
        return result;
    }
}