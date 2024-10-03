class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for(int i=0; i<magazine.length();i++){
            if(magazineMap.containsKey(magazine.charAt(i))){
                int val = magazineMap.get(magazine.charAt(i));
                val++;
                magazineMap.put(magazine.charAt(i),val);
            }else{
                magazineMap.put(magazine.charAt(i),1);
            }
        }
        for(int i=0; i<ransomNote.length();i++){
            boolean containsKey = magazineMap.containsKey(ransomNote.charAt(i));
            Integer integer = magazineMap.get(ransomNote.charAt(i));
            if(magazineMap.containsKey(ransomNote.charAt(i)) && magazineMap.get(ransomNote.charAt(i))>0){
                int val = magazineMap.get(ransomNote.charAt(i));
                val--;
                magazineMap.put(ransomNote.charAt(i),val);
                if(i==ransomNote.length()-1){
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }
}