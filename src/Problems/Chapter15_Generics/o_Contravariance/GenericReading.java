package Problems.Chapter15_Generics.o_Contravariance;

import java.util.Arrays;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/15/17. Page 554.
 */
class Fruit {}
class Apple extends Fruit {}
public class GenericReading {

    static <T> T readExact(List<T> list) {
        return list.get(0);
    }

    static List<Apple> appleList = Arrays.asList(new Apple());
    static List<Fruit> fruitList = Arrays.asList(new Fruit());

    // статический метод адаптируется к каждому вызову:
    static void f1() {
        Apple a = readExact(appleList);
        Fruit f = readExact(fruitList);
        f = readExact(appleList);
    }

    // но если речь идет о классе, тип устанавливается при создании экземпляра класса:
    static class Reader<T> {
        T readExact(List<T> list) { return list.get(0); }
    }

    static void f2() {
        Reader<Fruit> fruitReader = new Reader<Fruit>();
        Fruit f = fruitReader.readExact(fruitList);
        // Fruit a = fruitReader.readExact(appleList); // ошибка
        // readExact(List<Fruit>) не может применяться к (List<Apple>).
    }

    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }
    }

    static void f3() {
        CovariantReader<Fruit> fruitReader = new CovariantReader<Fruit>();
        Fruit f = fruitReader.readCovariant(fruitList); // ok
        Fruit a = fruitReader.readCovariant(appleList); // ok
    }

    public static void main(String[] args) {
        f1(); f2(); f3();
    }

}
