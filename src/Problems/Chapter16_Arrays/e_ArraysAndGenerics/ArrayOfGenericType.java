package Problems.Chapter16_Arrays.e_ArraysAndGenerics;

/**
 * @author SashaKhyzhun on 4/21/17. Page 613.
 * Массивы обобщенных типов не компилируются.
 */

public class ArrayOfGenericType<T> {
    T[] array; // ok

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
        //! array = new T[size]; // Illegal
        array = (T[]) new Object[size]; // "Неконтролируемое" предупреждение
    }

    // Недопустимо
    //! public <U> U[] makeArray() { return new U[10]; }

    /**
     * Стирание снова встает на пути — этот пример пытает создать массив типов,
     * которые были стерты, а следовательно, стали неизвестными.
     **/

}
