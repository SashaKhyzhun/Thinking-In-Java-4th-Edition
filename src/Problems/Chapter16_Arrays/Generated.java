package Problems.Chapter16_Arrays;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;
import Problems.Chapter17_DetailsAboutContainers.a_FillingArrays.CollectionData;

/**
 * @author SashaKhyzhun on 4/24/17.
 */
public class Generated {

    // Fill an existing array:
    public static <T> T[] array(T[] a, Generator<T> gen) {
        return new CollectionData<T>(gen, a.length).toArray(a);
    }

    // Create a new array:
    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type, Generator<T> gen, int size) {
        T[] a = (T[])java.lang.reflect.Array.newInstance(type, size);
        return new CollectionData<T>(gen, size).toArray(a);
    }

} ///:~