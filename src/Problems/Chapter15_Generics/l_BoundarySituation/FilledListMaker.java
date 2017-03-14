package Problems.Chapter15_Generics.l_BoundarySituation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/14/17. Page 534
 */
public class FilledListMaker<T> {

    List<T> create(T t, int n) {
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker<String> stringMaker = new FilledListMaker<String>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.println(list);
    }

}
