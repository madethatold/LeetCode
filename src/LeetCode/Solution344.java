package LeetCode;

/**
 * @author colorful
 * @date 2020/7/8
 **/
//344. 反转字符串
public class Solution344 {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }

    }
}
