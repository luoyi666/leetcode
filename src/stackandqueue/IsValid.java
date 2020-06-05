package stackandqueue;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(ch);
            }else{
                if ((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']')) {
                    stack.pop();
                }else {
                    stack.add(ch);
                }
            }

        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
