package LeetCode;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.logging.Level;

/**
 * @author colorful
 * @date 2020/9/16
 **/
//剑指 Offer 67. 把字符串转换成整数
public class Solution67_Offer {
    public static void main(String[] args) {
        System.out.println(strToInt("-111"));
    }

    public static int strToInt(String str) {
        boolean isNegative=false;
        int i =0;
        long res=0;
        str=str.trim();
        if(str.length()==0) return 0;
        char[] ch=str.toCharArray();
        if(ch[0]!='-' && ch[0]!='+' && !Character.isDigit(ch[0])) return 0;
        if(ch[0]=='-'){
            isNegative=true;
            i++;
        }else if(ch[0]=='+'){
            i++;
        }
        while(i<str.length() && Character.isDigit(ch[i])){
            res=res*10+(ch[i++]-'0');
            if(res>Integer.MAX_VALUE && isNegative==false) return Integer.MAX_VALUE;
            if(res>Integer.MAX_VALUE && isNegative==true) return Integer.MIN_VALUE;
        }
        return isNegative==false?(int)res:(int)-res;
    }
}
