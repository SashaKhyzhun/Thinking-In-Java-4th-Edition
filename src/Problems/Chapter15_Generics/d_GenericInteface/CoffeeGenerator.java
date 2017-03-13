package Problems.Chapter15_Generics.d_GenericInteface;

import java.util.Iterator;
import java.util.Random;

/**
 * @author SashaKhyzhun on 3/13/17.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = { Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class };
    private static Random random = new Random(47);

    // для перебора:
    private int size = 0;
    public CoffeeGenerator(int sz) { size = sz; }
    public CoffeeGenerator() {}

    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
            // сообщить программисту об ошибках  во время выполнения:
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
        public void remove() { // Не реализован
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }
    }



}
