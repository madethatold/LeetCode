package LeetCode;


import java.util.Stack;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//155. 最小栈
public class MinStack {
    Stack<Integer> stack=null;
    public MinStack(){
        stack=new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min=stack.get(0);
        for(int i:stack){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
}
