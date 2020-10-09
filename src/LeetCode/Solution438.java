package LeetCode;

import java.time.temporal.Temporal;
import java.util.*;

/**
 * @author colorful
 * @date 2020/9/25
 **/
//438. 找到字符串中所有字母异位词
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> charactersP=new HashMap<>();
        boolean is=false;

        for (int i=0;i<s.length()-p.length()+1;i++){
            String t=s.substring(i,i+p.length());
            for (int m=0;m<p.length();m++){
                charactersP.put(s.charAt(m),0);
            }
            for (int j=0;j<t.length();j++){
                if (charactersP.containsKey(t.charAt(j))){
                    charactersP.put(t.charAt(j),1);
                }
            }
            if (charactersP.containsValue(0)){
                is=true;
            }
            if (!is) res.add(i);
        }
        return res;
    }

}
