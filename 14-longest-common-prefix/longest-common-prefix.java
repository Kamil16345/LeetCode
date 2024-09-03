class Solution {
    public String longestCommonPrefix(String[] strs) {
                Arrays.sort(strs);
        boolean b = Arrays.stream(strs).allMatch(str -> str.startsWith(strs[0]));
        if (b) {
            System.out.println("b: "+strs[0]);
            return strs[0];
        } else {
            for (int i = strs[0].length() - 1; i >= 0; i--) {
                String prefix = strs[0].substring(0, i);
                boolean c = Arrays.stream(strs).allMatch(str -> str.startsWith(prefix));
                if (c) {
                    System.out.println("c: " + strs[0].substring(0, i));
                    return strs[0].substring(0, i);
                }
            }
        }
        return "";
    }
}