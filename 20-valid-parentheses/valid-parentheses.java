class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.add(s.charAt(i));
            else if (!stack.isEmpty()){
                if (s.charAt(i) == ')' && stack.peek().equals('(')) stack.pop();
                else if (s.charAt(i) == ']' && stack.peek().equals('[')) stack.pop();
                else if (s.charAt(i) == '}' && stack.peek().equals('{')) stack.pop();
                else return false;
            }
            else return false;
        }
        return stack.isEmpty();
    }
}