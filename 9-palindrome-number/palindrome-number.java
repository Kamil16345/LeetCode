class Solution {
    public boolean isPalindrome(int x) {
        String stringX= String.valueOf(x);
        int start = 0;
        int end = stringX.length()-1;
        while(start<=end){
            if(stringX.charAt(start)!=stringX.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}