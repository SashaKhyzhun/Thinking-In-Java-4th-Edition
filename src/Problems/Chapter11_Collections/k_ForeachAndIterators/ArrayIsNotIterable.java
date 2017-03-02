package Problems.Chapter11_Collections.k_ForeachAndIterators;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by SashaKhyzhun on 3/1/17. Page 347.
 * Команда foreach работает с массивом или любой другой реализацией Iterable, но это
 * не означает, что массив автоматически реализует Iterable, и не подразумевает авто-
 * матической упаковки:
 */
public class ArrayIsNotIterable {

    private static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));

        String[] strings = { "A", "B", "C" };

        // Массив работает в foreach, но не является Iterable:
        // ! test(strings);
        // Его необходимо явно преобразовать в Iterable:
        test(Arrays.asList(strings));

    }


}
