package Problems.Chapter17_DetailsAboutContainers.g_SetAndSortOrder;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author SashaKhyzhun on 5/17/17. Page 663.
 * SortedSet.
 * Элементы отсортированного множества SortedSet гарантированно хранятся в порядке сортировки,
 * что позволяет задействовать дополнительную функциональность, обеспечиваемую интерфейсом SortedSet.
 *
 * +----------------------------------------------------------------------------------+
 * |# Coparator comparator(): | return объект Comparator, использующийся для данного  |
 * |                          | множества, или null для естественного упорядочиваня.  |
 * +----------------------------------------------------------------------------------+
 * |# Object first():         | Просизводит наименьший элемент множества.             |
 * +----------------------------------------------------------------------------------+
 * |# Object last();          | Просизводит наибольний элемент множества.             |
 * +----------------------------------------------------------------------------------+
 * |# SortedSet subSet        | производит надмножество данного множества, в которое  |
 * | (fromElement, toElement) | включены элементы от fromElement (включительно)       |
 * |                          | до toElelemt (не включительно)                        |
 * +----------------------------------------------------------------------------------+
 * |# SortedSet headSet       | производит надмножество, содержащее все элементы,     |
 * | (toElement)              | меньше toElement                                      |
 * +----------------------------------------------------------------------------------+
 * |# SortedSet tailSet       | производит нажмножество, содержащее все элементы,     |
 * | (toElement)              | большие либо равные fromElement                       |
 * +----------------------------------------------------------------------------------+
 */
public class SortedSetDemo {

    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<String>();

        Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));

        System.out.println("sortedSet: " + sortedSet);

        String low = sortedSet.first();
        String high = sortedSet.last();

        System.out.println("low: " + low);
        System.out.println("high: " + high);

        System.out.println("---------for----------");
        Iterator<String> it = sortedSet.iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) low = it.next();
            if (i == 6) high = it.next();
            else it.next();
        }
        System.out.println("low: " + low);
        System.out.println("high: " + high);
        System.out.println("----------------------");
        System.out.println("sortedSet:                   " + sortedSet);
        System.out.println("sortedSet.subSet(low, high): " + sortedSet.subSet(low, high));
        System.out.println("sortedSet.headSet(high):     " + sortedSet.headSet(high));
        System.out.println("sortedSet.tailSet(low):      " + sortedSet.tailSet(low));

    }

}
