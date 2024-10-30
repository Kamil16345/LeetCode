class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0)return "";
        int minLength = Arrays.stream(strs).mapToInt(String::length).min().orElse(0);
        if(minLength==0) return "";
        String prefix = strs[0].substring(0, minLength);
        for(int i=0; i<strs.length; i++){
            if(!strs[i].startsWith(prefix)){
                minLength--;
                prefix=strs[0].substring(0, minLength);
                i=0;
            }
        }
        return prefix;
    }
}