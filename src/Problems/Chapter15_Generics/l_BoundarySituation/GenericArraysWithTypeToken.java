package Problems.Chapter15_Generics.l_BoundarySituation;

import java.lang.reflect.Array;

/**
 * @author SashaKhyzhun on 3/14/17. Page 543.
 * Внутреннее представление массива в форме Object[] вместо T[]
 * снижает опасность того, что вы забудете тип массива на стадии
 * выполнения и случайно внесете ошибку.
 */
public class GenericArraysWithTypeToken<T> {

    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArraysWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    // Предоставляет нижележащее представление:
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArraysWithTypeToken<Integer> gai = new
                GenericArraysWithTypeToken<Integer>(Integer.class, 10);

        // тепер работает:
        Integer[] ia = gai.rep();

    }
}
