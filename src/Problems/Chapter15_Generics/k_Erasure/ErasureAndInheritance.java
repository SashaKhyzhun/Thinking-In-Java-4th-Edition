package Problems.Chapter15_Generics.k_Erasure;

/**
 * @author SashaKhyzhun on 3/14/17. Page 532.
 */

class GenericBase<T> {
    private T element;
    public void set(T arg) {
        arg = element;
    }
    public T get() { return element; }
}

class Derived1<T> extends GenericBase<T> {}

class Derived2 extends GenericBase {} // Без предупреждений

//class Derived3 extends GenericBase<?> {}
// Странная ошибка:
// найдет непредвиденный тип: ?
// требуется: класс или интерфейс без ограничений

public class ErasureAndInheritance {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object object = d2.get();

        d2.set(object); // Предупреждение!
    }

}
