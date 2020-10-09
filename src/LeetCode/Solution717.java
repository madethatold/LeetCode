package LeetCode;

/**
 * @author colorful
 * @date 2020/10/8
 **/
//717. 1比特与2比特字符
public class Solution717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while (i<bits.length){
            if (bits[i]==0){
                i++;
            }
            if(bits[i]==1){
                i+=2;
            }
        }
        if (i==bits.length-1) return true;
        return false;
    }
}
