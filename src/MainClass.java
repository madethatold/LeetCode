import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * @author colorful
 * @date 2020/7/25
 **/
public class MainClass {
    public static void main(String[] args) {
        System.out.println("hello world");
        TreeSet<String> treeSet=new TreeSet<>();
//        treeSet.add(null);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        System.out.println(list.subList(0,list.size()));

    }
}
