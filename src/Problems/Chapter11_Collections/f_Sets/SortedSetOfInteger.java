package Problems.Chapter11_Collections.f_Sets;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by SashaKhyzhun on 2/27/17.
 */
public class SortedSetOfInteger {

    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> integerSortedSet = new TreeSet<Integer>();

        for (int i = 0; i < 10000; i++) {
            integerSortedSet.add(random.nextInt(30));
        }

        System.out.println(integerSortedSet);
    }

}
