package LeetCode;

import java.util.Stack;

/**
 * @author colorful
 * @date 2020/7/23
 **/
//402. 移掉K位数字
public class Solution402 {
    public static void main(String[] args) {
        String s="1234560";
        System.out.println(removeKdigits(s,6));
    }

    public static String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        char[] chars = num.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            while (!stack.isEmpty() && stack.peek() - '0' > chars[i] - '0' && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(chars[i]);
        }
        while (k != 0) {
            stack.pop();
            k--;
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        while (builder.length() > 1 && builder.charAt(builder.length() - 1) == '0') {
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.reverse().toString();
    }
}
