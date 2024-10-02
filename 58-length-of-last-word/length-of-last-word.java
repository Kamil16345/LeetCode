class Solution {
    public int lengthOfLastWord(String s) {
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if(counter>0){
                    break;
                }
            } else if (s.charAt(i) != ' ') {
                counter++;
            }
        }
        return counter;
    }
}