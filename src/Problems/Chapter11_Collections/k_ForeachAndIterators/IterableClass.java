package Problems.Chapter11_Collections.k_ForeachAndIterators;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by SashaKhyzhun on 3/1/17. Page 357.
 * Любой класс, реализующий Iterable, его можно будет использовать к команде foreach:
 */
public class IterableClass implements Iterable<String> {

    protected String[] words = ("And that is how we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }
            @Override
            public String next() {
                return words[index++];
            }
            public void remove() { // не реализован
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.print(s + " ");
        }
    }

    /**
     * Метод iterator() возвращает экземпляр анонимной внутренней реализации
     * Iterator<String>, которая выдает каждое слово в массиве.
     *
     */

}
