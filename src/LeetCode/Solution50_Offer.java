package LeetCode;

import java.util.Arrays;

/**
 * @author colorful
 * @date 2020/9/18
 **/
public class Solution50_Offer {
    public static void main(String[] args) {
        String s="aadbcc";
        System.out.println(firstUniqChar(s));
    }
    public static char firstUniqChar(String s) {
        int[] r = new int[26];
        for (int i = 0; i < s.length(); i++) {
            r[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(r));
        for (int i=0;i<s.length();i++){
            if (r[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
