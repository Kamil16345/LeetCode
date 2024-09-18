class Solution {
    public boolean isPalindrome(int x) {
        int start = 0;
        int end = String.valueOf(x).toCharArray().length-1;
        char[] chars = String.valueOf(x).toCharArray();
        while(start<=end){
            if(chars[start]!=chars[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}