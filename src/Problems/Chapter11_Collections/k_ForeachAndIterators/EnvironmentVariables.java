package Problems.Chapter11_Collections.k_ForeachAndIterators;

import java.util.Map;

/**
 * Created by SashaKhyzhun on 3/1/17. Page 357.
 * В Java SE5 интерфейс Iterable реализуется многими классами, прежде всего всеми
 * реализациями Collection(но не Map).
 */
public class EnvironmentVariables {

    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * Метод System.getenv() возвращает Map;
     * метод entrySet() создает контейнер Set с элементами Map.Entry;
     * контейнер Set реализует Iterable, поэтому он может использоваться в циклах foreach.
     */

}
