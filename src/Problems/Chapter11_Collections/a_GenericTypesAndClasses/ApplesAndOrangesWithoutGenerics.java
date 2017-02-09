package Problems.Chapter11_Collections.a_GenericTypesAndClasses;

/**
 * Created by SashaKhyzhun on 2/7/17. Page 324
 * Простой пример использования коллекций (с предупреждением компилятора).
 * {ThrowsException}
 *
 */

import java.util.*;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() { return id; }
}

class Orange {}


public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        // не мешает добавить Orange в apples:
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).id(); // id from class Apple, esli chto
            // Объект Orange обнаруживается только во время выполнения
        }
    }

}
