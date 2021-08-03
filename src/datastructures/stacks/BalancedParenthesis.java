package datastructures.stacks;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String expression = "(a+b)+(c+d}}";
        System.out.println(isBalanced(expression));
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<expression.length(); i++) {
            char bracket = expression.charAt(i);
            //opening braces
            if(bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
            } else if(bracket == '}' || bracket == ']' || bracket == ')') {
                if(!stack.isEmpty()) {
                    if (bracket == '}' && stack.peek() == '{') stack.pop();
                    else if (bracket == ']' && stack.peek() == '[') stack.pop();
                    else if (bracket == ')' && stack.peek() == '(') stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
