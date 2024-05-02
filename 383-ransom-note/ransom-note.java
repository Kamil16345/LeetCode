class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> occurrences = new HashMap<>();
        char[] magazineArr = magazine.toCharArray();
        char[] ransomNoteArr = ransomNote.toCharArray();
        for (char ch : magazineArr){
            if(occurrences.containsKey(ch)){
                occurrences.put(ch, occurrences.get(ch)+1);
            } else {
                occurrences.put(ch, 1);
            }
        }
        for (char ch : ransomNoteArr){
            if(occurrences.containsKey(ch)){
                if(occurrences.get(ch)>0){
                    occurrences.put(ch, occurrences.get(ch)-1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}