class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 || needle.length() == 0) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        if (j == needle.length() - 1 && haystack.charAt(i+j) == needle.charAt(j)) {
                            return i;
                        } else if (j == needle.length() - 1 && haystack.charAt(i+j) != needle.charAt(j)) {
                            break;
                        }
                    }else{
                        break;
                    }
                }
            }
        }
        return -1;
    }
}