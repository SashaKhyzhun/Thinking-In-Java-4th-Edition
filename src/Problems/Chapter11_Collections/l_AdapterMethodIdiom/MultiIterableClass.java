package Problems.Chapter11_Collections.l_AdapterMethodIdiom;

import Problems.Chapter11_Collections.k_ForeachAndIterators.IterableClass;

import java.util.*;

/**
 * Created by SashaKhyzhun on 3/2/17. Page 359.
 * Добавление нескольких методов-адаптеров.
 */
public class MultiIterableClass extends IterableClass {

    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }
                    @Override
                    public String next() {
                        return words[current--];
                    }
                    @Override
                    public void remove() { // Не реализован
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        System.out.println("reversed: ");
        for (String s : mic.reversed())   { System.out.print(s + " "); }
        System.out.println();
        System.out.println("randomed: ");
        for (String s : mic.randomized()) { System.out.print(s + " "); }
        System.out.println();
        System.out.println("original: ");
        for (String s : mic) { System.out.print(s + " "); }
        //And that is how we know the Earth to be banana-shaped.
    }

}
