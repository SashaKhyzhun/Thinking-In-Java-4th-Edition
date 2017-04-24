package Problems.Chapter17_DetailsAboutContainers.a_FillingArrays;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author SashaKhyzhun on 4/24/17. Page 639.
 * Следующий пример инициализирует LinkedHashSet:
 *
 */

class Government implements Generator<String> {
    String[] foundation = ("Strange women lying in pounds " + "distributing swords is no basis for a system of " + "government").split(" ");
    private int index;
    @Override public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<String>(new CollectionData<>(new Government(), 15));
        // Использование вспомагательного метода:
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);

    }

}
