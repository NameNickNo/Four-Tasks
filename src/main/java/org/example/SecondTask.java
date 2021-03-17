package org.example;

import java.util.Stack;

public class SecondTask {
    public static void main(String[] args) {
        String s1 = "([][[]()])";
        String s2 = "([][]()";

        System.out.println(correctSyntax(s1));
        System.out.println(correctSyntax(s2));

    }

    public static boolean correctSyntax(String regExp) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < regExp.length(); i++) {
            char character = regExp.charAt(i);

            if (stack.empty()) {
                stack.push(character);
            } else {
                char lastElement = stack.peek();

                int charIndex = determineIndex(character);
                int lastElementIndex = determineIndex(lastElement);

                if (charIndex + lastElementIndex == 0) {
                    stack.pop();
                } else {
                    stack.push(character);
                }
            }

        }

        return stack.empty();
    }

    public static int determineIndex(char c) {
        if (c == '(') {
            return 1;
        } else if (c == ')') {
            return -1;
        } else if (c == '[') {
            return 2;
        } else if (c == ']') {
            return -2;
        } else return 404;
    }
}
