package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author colorful
 * @date 2020/9/27
 **/
//3. 无重复字符的最长子串
public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;

    }
//    public int lengthOfLongestSubstring(String s) {
//        Map<Character,Integer> map=new HashMap<>();
//        int res=Integer.MIN_VALUE;
//        int i=0;
//        while (i<s.length()){
//            char t=s.charAt(i);
//            if (!map.containsKey(t)){
//                map.put(s.charAt(i),i);
//                i++;
//            }else {
//                res=Math.max(res,map.size());
//                i=map.get(t)+1;
//                map.clear();
//            }
//        }
//        if (res==Integer.MIN_VALUE) res=map.size();
//        return res;
//
//    }
}
