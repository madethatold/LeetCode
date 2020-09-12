package LeetCode;

/**
 * @author colorful
 * @date 2020/8/30
 **/
//557. 反转字符串中的单词 III
public class Solution557 {
    public String reverseWords(String s) {
        StringBuilder builder=new StringBuilder("");
        for (int i=0;i<s.length();i++){
            int l=i;
            if (s.charAt(i)==' '){
                continue;
            }
            while (i<s.length()&&s.charAt(i)!=' ') {
                i++;
            }
            builder.append(reverse(s.substring(l,i)));
            if (i!=s.length()){
                builder.append(" ");
            }

        }
        return builder.toString();
    }


    public String reverse(String s){
        int n=s.length();
        String result="";
        for (int i=0;i<n;i++){
            result=s.charAt(i)+result;
        }
        return result;
    }
}
