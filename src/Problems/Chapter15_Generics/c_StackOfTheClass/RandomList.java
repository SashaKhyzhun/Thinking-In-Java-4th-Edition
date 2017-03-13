package Problems.Chapter15_Generics.c_StackOfTheClass;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author SashaKhyzhun on 3/13/17. Page 508.
 */
public class RandomList<T> {

    private ArrayList<T> storage = new ArrayList<T>();
    private Random random = new Random(47);

    public void add(T item) {
        storage.add(item);
    }
    public T select() {
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();

        for (String s : ("The quick brown fox jumped over the lazy brown dog").split(" ")) {
            rs.add(s);
        }

        for (int i = 0; i < 11; i++) {
            System.out.print(rs.select() + " ");
        }
        System.out.println();
        System.out.println("=======================");

//        int[] ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//
//        for (Integer i : ints) {
//            rs.add(String.valueOf(i));
//        }
//        for (int i = 0; i < 11; i++) {
//            if (rs.select().length() == 1) {
//                System.out.print(rs.select() + " ");
//            }
//        }
    }

}
