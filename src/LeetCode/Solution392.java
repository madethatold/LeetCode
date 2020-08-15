package LeetCode;

/**
 * @author colorful
 * @date 2020/8/11
 **/
//392. 判断子序列
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;
        int k = 0;
        for (int i = 0; i < t.length(); i++) {
            char curr = t.charAt(i);
            if (curr == s.charAt(k)) {
                k++;
            }
            if (k == s.length()) {
                return true;
            }
        }
        return false;
    }
}
