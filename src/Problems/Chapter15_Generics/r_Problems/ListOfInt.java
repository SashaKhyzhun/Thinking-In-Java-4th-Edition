package Problems.Chapter15_Generics.r_Problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/15/17. Page 561.
 * Примитивы не могут использоваться как параметры-типы, но можно решить эту проблему
 * созданием классов-"оберток" в сочетании с автоматической упаковкой.
 */
public class ListOfInt {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            li.add(i);
        }

        for (int i : li) {
            System.out.print(i + " ");
        }

    }

}
