class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') stack.add(s.charAt(i));
            else if(!stack.isEmpty()){
                if (s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                else if (s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                else if (s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                else return false;
            }
            else return false;
        }
        return stack.isEmpty();
    }
}