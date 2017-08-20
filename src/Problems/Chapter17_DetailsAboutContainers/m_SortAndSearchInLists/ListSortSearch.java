package Problems.Chapter17_DetailsAboutContainers.m_SortAndSearchInLists;

import java.util.*;

/**
 * @author SashaKhyzhun on 8/7/17. Page 709
 */
public class ListSortSearch {

    public static void main(String[] args) {
        List<String> utilities = Arrays.asList(
                "one two three four five six one".split(" "));

        List<String> list = new ArrayList<>(utilities);
        list.addAll(utilities);
        System.out.println(list);


        Collections.shuffle(list, new Random(47));
        System.out.println("Shuffled: " + list);

        // Использование ListIterator для отсечения последних элементов:
        ListIterator<String> it = list.listIterator(10);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        System.out.println("Trimmed: " + list);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        String key = list.get(7);
        int index = Collections.binarySearch(list, key);

        System.out.println("Location of " + key + " is " + index
                + ", list.get(" + index + ") = " + list.get(index));

        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive sorted: " + list);

        key = list.get(7);
        index = Collections.binarySearch(list, key, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Location of " + key + " is " + index
                + ", list.get(" + index + ") = " + list.get(index));

    }

}
