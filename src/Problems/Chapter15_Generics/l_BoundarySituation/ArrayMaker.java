package Problems.Chapter15_Generics.l_BoundarySituation;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author SashaKhyzhun on 3/14/17. Page 533.
 * Граничные ситуации.
 * На мой взгляд, из-за стирания самый нелогочный аспект обобщений заключается
 * в возмодности представления того, что не имеет смысла, например:
 */
public class ArrayMaker<T> {
    private Class<T> kind;
    public ArrayMaker(Class<T> kind) { this.kind = kind; }

    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
        String[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }

    /*
     * При том, что kind хранится в виде Class<T>, механизме стирания означает, что в
     * действительности хранится только Class без бараметра. Таким образом, при выполнении
     * любой операции (например, создании массива) Array.newInstance() не разполагает
     * информацией типа, подразумеваемой для kind; следовательно, метод не может выдать конкретный
     * результат, и возникает необходимость в приведении типа с выдачей предупреждения.
     *
     * Метод Array.newInstance() рекомендуется использовать для создания массивов в обобщениях.
     */

}
