package LeetCode;

/**
 * @author colorful
 * @date 2020/8/13
 **/
//面试题 17.11. 单词距离
public class Solution17_11 {
    public int findClosest(String[] words, String word1, String word2) {
        int in1=-1;
        int in2=-1;
        int result=Integer.MAX_VALUE;
        for (int i=0;i<words.length;i++){
            if (words[i].equals(word1)){
               in1=i;
                if (in2!=-1){
                    result=Math.min(result,Math.abs(in1-in2));
                }
            }
            if (words[i].equals(word2)){
                in2=i;
                if (in1!=-1){
                    result=Math.min(result,Math.abs(in1-in2));
                }
            }
        }
        return result;
    }
}
