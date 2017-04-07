package Problems.Chapter15_Generics.y_CompensationLatentTyping;

import Problems.Chapter15_Generics.d_GenericInteface.Coffee;
import Problems.Chapter15_Generics.d_GenericInteface.Generator;
import Problems.Chapter15_Generics.d_GenericInteface.Latte;
import Problems.Chapter15_Generics.d_GenericInteface.Mocha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author SashaKhyzhun on 4/7/17. Page 593.
 *
 * Моделирование латентной типизации с использованием адаптеров.
 */
interface Addable<T> { void add(T t); }

public class Fill2 {
    // Версия с макетом:
    public static <T> void fill (Addable<T> addable, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++) {
            try {
                addable.add(classToken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    // Версия с генератором:
    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
        for (int i = 0; i < size; i++) {
            addable.add(generator.next());
        }
    }
}

// Для адаптации базового типа необходимо использовать композицию.
// Включение поддержки Addable в производный контейнер Collection
// с использованием композиции:
class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> c;
    public AddableCollectionAdapter(Collection<T> c) { this.c = c; }
    @Override public void add(T t) { c.add(t); }
}

// Вспомагательный класс для автоматической фиксации типа:
class Adapter {
    public static <T> Addable<T> collectionAdapter(Collection<T> c) {
        return new AddableCollectionAdapter<T>(c);
    }
}

// Для адаптации конкретного типа можно применить наследование.
// Включение Addable в SimpleQueue Addable посредством наследования:
class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
    @Override public void add(T t) { super.add(t); }
}

class Fill2Test {
    public static void main(String[] args) {
        // Адаптация Collection:
        List<Coffee> carrier = new ArrayList<Coffee>();
        Fill2.fill(new AddableCollectionAdapter<Coffee>(carrier), Coffee.class, 3);
        Fill2.fill(new AddableCollectionAdapter<Coffee>(carrier), Coffee.class, 3);

        // Вспомогательный метод фиксирует тип:
        Fill2.fill(Adapter.collectionAdapter(carrier), Latte.class, 2);
        for (Coffee c : carrier) {
            System.out.println(c);
        }

        System.out.println("-------------------------");

        // Использование адаптированного класса:
        AddableSimpleQueue<Coffee> coffeeQueue = new AddableSimpleQueue<Coffee>();
        Fill2.fill(coffeeQueue, Mocha.class, 4);
        Fill2.fill(coffeeQueue, Latte.class, 1);

        for (AddableSimpleQueue<Coffee> it = coffeeQueue; it.hasNext(); ) {
            Coffee c = it.next();
            System.out.println(c);
        }
    }
}