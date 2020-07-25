package LeetCode;

import java.util.Stack;

/**
 * @author colorful
 * @date 2020/7/24
 **/
//921. 使括号有效的最少添加
public class Solution921 {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        int k = 0;
        for (int i = 0; i < S.length(); i++) {
            char temp = S.charAt(i);
            if (temp == '(') {
                stack.push(temp);
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    k++;
                }
            }
        }
        while (!stack.isEmpty()) {
            stack.pop();
            k++;
        }
        return k;
    }
}
