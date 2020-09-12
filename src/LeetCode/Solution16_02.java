package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author colorful
 * @date 2020/9/5
 **/
//面试题 16.02. 单词频率
public class Solution16_02 {
    Map<String,Integer> map=new HashMap<>();

    public Solution16_02(String[] book) {
        for (String temp:book){
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
    }

    public int get(String word) {
        if (map.containsKey(word)) return map.get(word);
        return 0;
    }
}
