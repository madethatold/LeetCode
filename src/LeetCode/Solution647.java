package LeetCode;

/**
 * @author colorful
 * @date 2020/9/20
 **/
//647. 回文子串
public class Solution647 {

    public static void main(String[] args) {
        String s="abccba";
        System.out.println(countSubstrings(s));
    }
    public static int countSubstrings(String s) {
        int res=0;
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                String temp=s.substring(i,j+1);
                if (is(temp)) res++;
            }
        }
        return res;

    }
    public static boolean is(String s){
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}
