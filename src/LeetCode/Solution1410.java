package LeetCode;

/**
 * @author colorful
 * @date 2020/7/25
 **/
//1410. HTML 实体解析器
public class Solution1410 {
    public String entityParser(String text) {
        text.replaceAll("&quot;", "\"")
                .replaceAll("&apos;", "'")
                .replaceAll("&amp;", "&")
                .replaceAll("&gt;", ">")
                .replaceAll("&lt;", "<")
                .replaceAll("&frasl;", "/")
                .replaceAll("&","&");
        return text;
    }
}
