package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 536
 */
public class Erased<T> {
    private final int SIZE = 100;

    public static void f(Object arg) {
//        if (arg instanceof T) {}  // ошибка
//        T var = new T();          // ошибка
//        T[] array  = new T[SIZE]; // ошибка
//        T[] array2 = new (T) new Object[SIZE]; // ошибка

    }

}
