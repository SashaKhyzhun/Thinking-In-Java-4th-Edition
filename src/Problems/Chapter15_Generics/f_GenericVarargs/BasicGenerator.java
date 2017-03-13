package Problems.Chapter15_Generics.f_GenericVarargs;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;

/**
 * @author SashaKhyzhun on 3/13/17.
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            // Предполагается, что type - открытый класс:
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Создание тенератора по умолчанию для заданного type:
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }

}
