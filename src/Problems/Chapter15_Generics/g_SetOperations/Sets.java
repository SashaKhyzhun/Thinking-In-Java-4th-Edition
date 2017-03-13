package Problems.Chapter15_Generics.g_SetOperations;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SashaKhyzhun on 3/13/17.
 * Операции с множествами
 */
public class Sets {

    // возвращает объедененные элементы
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }

    // возвращаем общие элементы
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }

    // возвращает вычтенные подмножества из надмножества:
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<T>(superset);
        result.removeAll(subset);
        return result;
    }

    // Рефлексивность -- все, что не входит в пересение:
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }

}
