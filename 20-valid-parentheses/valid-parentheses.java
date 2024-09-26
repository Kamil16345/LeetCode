class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch.equals('{') || ch.equals('(') || ch.equals('[')) {
                chars.push(ch);
            } else if (ch.equals('}') || ch.equals(')') || ch.equals(']')) {
                if(chars.size()>0){
                    if (chars.peek().equals('{') && ch.equals('}')) {
                        chars.pop();
                    } else if (chars.peek().equals('(') && ch.equals(')')) {
                        chars.pop();
                    } else if (chars.peek().equals('[') && ch.equals(']')) {
                        chars.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return chars.size()==0;
    }
}