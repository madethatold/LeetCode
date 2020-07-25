package LeetCode;


import java.util.Stack;

/**
 * @author colorful
 * @date 2020/7/21
 **/
//394. 字符串解码
public class Solution394 {
    public static void main(String[] args) {

    }
    public String decodeString(String s) {
        Stack<String> stack=new Stack<>();
        String re="";
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==']'){
                String string="";
                String count="";
                int counts=0;
                String result="";
                while (!stack.peek().equals("[")){
                    string=stack.pop()+string;
                }
                stack.pop();
                while (!stack.isEmpty() && stack.peek().charAt(0)>='0' && stack.peek().charAt(0)<='9'){
                    count=stack.pop()+count;
                }
                counts=Integer.parseInt(count);
                for(int k=0;k<counts;k++) {
                    result = result + string;
                }
                stack.push(result);
            }else {
                String str=""+s.charAt(i);
                stack.push(str);
            }
        }
        while (!stack.isEmpty()){
            re=stack.pop()+re;
        }
        return re;
    }
}
