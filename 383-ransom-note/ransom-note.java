class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>magazineMap = new HashMap<>();
        for(Character ch : magazine.toCharArray()){
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0)+1);
        }
        for(Character ch : ransomNote.toCharArray()){
            if(!magazineMap.containsKey(ch)|| magazineMap.get(ch)<=0){
                return false;
            }
            magazineMap.put(ch, magazineMap.get(ch)-1);
        }
        return true;
    }
}