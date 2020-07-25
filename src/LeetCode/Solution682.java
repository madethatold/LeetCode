package LeetCode;

import java.util.Stack;

/**
 * @author colorful
 * @date 2020/7/23
 **/
//682. 棒球比赛
public class Solution682 {
    public static void main(String[] args) {
        String s="-1";
        char c=s.charAt(0);
        System.out.println(c);
    }
    public int calPoints(String[] ops) {
        Stack<String> stack=new Stack<>();
        for (String op : ops) {
            if (op.equals("+")) {
                int op1=Integer.parseInt(stack.pop());
                int op2=Integer.parseInt(stack.pop());
                stack.push(String.valueOf(op2));
                stack.push(String.valueOf(op1));
                stack.push(String.valueOf(op1+op2));
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                int op3=Integer.parseInt(stack.peek());
                stack.push(String.valueOf(2*op3));
            } else {
                stack.push(op);
            }
        }
        int s=0;
        while (!stack.isEmpty()){
            s+=Integer.parseInt(stack.pop());
        }
        return s;
    }
}
