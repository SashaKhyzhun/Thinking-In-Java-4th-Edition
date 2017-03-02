package Problems.Chapter11_Collections.k_ForeachAndIterators;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by SashaKhyzhun on 3/1/17. Page 356.
 * До настоящего момента синтаксис foreach использовался в основном с массивами, но
 * он также работает для любого объекта Collections.
 */
public class ForEachCollections {

    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "Один два три четыре пять".split(" "));

        for (String s : cs) {
            System.out.print("'" + s + "' ");
        }
    }


}
