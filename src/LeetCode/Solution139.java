package LeetCode;

import java.util.List;

/**
 * @author colorful
 * @date 2020/9/10
 **/
//139. 单词拆分
public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0]=true;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (wordDict.contains(s.substring(j, i)) && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
