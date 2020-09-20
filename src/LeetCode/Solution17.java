package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author colorful
 * @date 2020/9/20
 **/
//17. 电话号码的字母组合
public class Solution17 {

    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if (digits.length()==0){
            return list;
        }
        Map<Character, String> map = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        back(digits,list,0,map,new StringBuffer());
        return list;
    }

    public void back(String digits,List<String> list,int index,Map<Character, String> map,StringBuffer sb){
        if (index==digits.length()){
            list.add(sb.toString());
        }else {
            char d=digits.charAt(index);
            String letter=map.get(d);
            int letterLen=letter.length();
            for (int i=0;i<letterLen;i++){
                sb.append(letter.charAt(i));
                back(digits,list,index+1,map,sb);
                sb.deleteCharAt(index);
            }
        }
    }
}
