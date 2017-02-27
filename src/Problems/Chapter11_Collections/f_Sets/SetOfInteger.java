package Problems.Chapter11_Collections.f_Sets;

import java.util.*;

/**
 * Created by SashaKhyzhun on 2/27/17. Page 344.
 * Контейнер Set сохраняет не более одного экземпляра каждого объекта-значения.
 * Set обладает таким же интерфейсом, как Collection, поэтому в Set нет дополнительной
 * функциональности, присутствующей в двух разновидностях List. В место этого Set
 * представляет собой разновидность Collection - просто обладает другими опведением.
 */
public class SetOfInteger {

    // should be not sorted

    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>(); // восходящее преобразование

        for (int i = 0; i < 10000; i++) {
            intset.add(rand.nextInt(30));
        }

        System.out.println(intset);

        sortThisShit(intset);
    }

    private static void sortThisShit(Set<Integer> integerSet) {
        for (int i = 0; i < integerSet.size(); i++) {

            for (int j = 0; j < i; j++) {

            }

        }
    }

}
