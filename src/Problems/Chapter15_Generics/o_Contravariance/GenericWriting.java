package Problems.Chapter15_Generics.o_Contravariance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/15/17. Page 553.
 * Ограничения супертипа ослабляют требования к тому, что может передаваться медоту:
 *
 * Метод writeExact() использует точный параметр-тип (без масок).
 * В f1() мы видим, что вызов работает нормально — при условии,
 * что в List<Apple> помещаются только объекты Аррlе. Однако метод writeExact()
 * не позволяет поместить Apple н 1ist<Fruit>, хотя вы и знаете, что это возможно.
 *
 * В методе writeWithWildcard() аргумент имеет тип List<? super T>, так что List
 * содержит конкретный тип, производный от T; следовательно, в аргументе методов List
 * можно безопасно передать T или любой тип, производный от T. В этом можно убедиться
 * в f2(), где тип Аррlе, как и прежде, можно поместить в List<Apple>, но также
 * появилась возможность поместить Аррlе в List<Fruit>.
 */
public class GenericWriting {

    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();

    static void f1() {
        writeExact(apples, new Apple()); // ok
        //writeExact(fruitList, new Apple()); // Несовместимые типа
    }

    // Mast
    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruits, new Apple());
    }

    public static void main(String[] args) { f1(); f2(); }


}
