class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        stack.push(' ');
        for(char c : s.toCharArray()) {
            if((c == ')' && stack.peek() == '(') 
               || (c == '}' && stack.peek() == '{') 
               || (c == ']' && stack.peek() == '[')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        if((!stack.isEmpty() && stack.peek() == ' ')) stack.pop();
        return stack.isEmpty();
    }
}