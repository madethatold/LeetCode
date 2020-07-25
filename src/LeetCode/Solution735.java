package LeetCode;

import java.util.Stack;

/**
 * @author colorful
 * @date 2020/7/24
 **/
//735. 行星碰撞
public class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty()) {
                stack.push(asteroid);
            } else {
                if (stack.peek()*asteroid>0) {
                    stack.push(asteroid);
                } else {
                    if(stack.peek()>0){
                        if(stack.peek()+asteroid<0){
                            stack.pop();
                            stack.push(asteroid);
                        }
                        if(stack.peek()+asteroid==0){
                            stack.pop();
                        }
                        if (stack.peek()+asteroid>0){

                        }
                    }else {
                        stack.push(asteroid);
                    }
                }
            }
        }
        int []result=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result;
    }
}
