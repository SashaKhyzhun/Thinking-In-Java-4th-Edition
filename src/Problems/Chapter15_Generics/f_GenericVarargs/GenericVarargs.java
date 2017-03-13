package Problems.Chapter15_Generics.f_GenericVarargs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/13/17. Page 516.
 * Списки аргуметов переменной длины и обобщенные методы
 */

public class GenericVarargs {

    // Реализует ту же функциональность, что и метод
    // java.util.Arrays.asList() стандартной библиотеки.
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);

        ls = makeList("A", "B", "C");
        System.out.println(ls);

        ls = makeList("QWERTYUIOPASDFGHJKLZXCVBNM".split(""));
        System.out.println(ls);
    }

}
