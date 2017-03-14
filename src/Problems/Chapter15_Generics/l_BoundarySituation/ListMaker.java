package Problems.Chapter15_Generics.l_BoundarySituation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/14/17.
 */
public class ListMaker<T> {

    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<String>();

        List<String> stringList = stringMaker.create();
        System.out.println(stringList);
    }

    /*
     * Компилятор не выдает предупреждений, хотя мы знаем (из-за стирания), что <T>
     * в new ArrayList<T>() внутри create() исключается - во время выполненя
     * в классе нет <T>, что выглядит бессмысленно.
     */

}
