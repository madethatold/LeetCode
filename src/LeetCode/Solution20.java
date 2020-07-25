package LeetCode;

import java.util.Stack;

/**
 * @author colorful
 * @date 2020/7/11
 **/
//20. 有效的括号
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                case '{':
                case '[':
                    stack.push(chars[i]);
                    continue;
                case '}':
                case ')':
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();
                    if (top == '(' && chars[i] != ')') {
                        return false;
                    }
                    if (top == '[' && chars[i] != ']') {
                        return false;
                    }
                    if (top == '{' && chars[i] != '}') {
                        return false;
                    }

                default:
                    break;
            }
        }
        return stack.size() == 0;
    }
}
