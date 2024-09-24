class Solution {
    public boolean isAnagram(String s, String t) {
                HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (Character ch: s.toCharArray()) {
            if(sMap.containsKey(ch)){
                Integer integer = sMap.get(ch);
                integer++;
                sMap.put(ch, integer);
            }else{
                sMap.put(ch, 1);
            }
        }
        for (Character ch: t.toCharArray()) {
            if(tMap.containsKey(ch)){
                Integer integer = tMap.get(ch);
                integer++;
                tMap.put(ch, integer);
            }else{
                tMap.put(ch, 1);
            }
        }
        return sMap.equals(tMap);
    }
}