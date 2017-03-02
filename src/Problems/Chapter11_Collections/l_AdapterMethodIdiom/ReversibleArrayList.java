package Problems.Chapter11_Collections.l_AdapterMethodIdiom;

import java.util.*;

/**
 * Created by SashaKhyzhun on 3/2/17. Page 359.
 * Идиома "Методом-Адаптер" позволяет использовать foreach
 * с другими разновидностями Iterable.
 */
public class ReversibleArrayList<T> extends ArrayList<T> {

    public ReversibleArrayList(Collection<T> c) { super(c); }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    @Override
                    public boolean hasNext() { return current > -1; }
                    @Override
                    public T next() { return get(current--); }
                    @Override
                    public void remove() { // не реализован
                        throw new UnsupportedOperationException();
                    }
                };
            };

        };
    }

    public static class AdapterMethodIdiom {
        public static void main(String[] args) {

            ReversibleArrayList<String> ral = new ReversibleArrayList<>(
                    Arrays.asList("To be or not to be".split(" "))
            );

            // Получение обычного итератора при помощи iterator():
            for (String s : ral) {
                System.out.print(s + " ");
            }
            System.out.println();

            // Передача реализации Iterable по вашему выбору
            for (String s : ral.reversed()) {
                System.out.print(s + " ");
            }

        }
    }
}
