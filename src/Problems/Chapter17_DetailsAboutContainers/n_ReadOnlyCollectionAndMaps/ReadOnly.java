package Problems.Chapter17_DetailsAboutContainers.n_ReadOnlyCollectionAndMaps;

import Problems.Chapter17_DetailsAboutContainers.c_Abstract.Countries;

import java.util.*;

/**
 * @author SashaKhyzhun on 8/7/17. Page 710
 */
public class ReadOnly {

    static Collection<String> data = new ArrayList<String>(Countries.names(6));

    public static void main(String[] args) {

        Collection<String> c = Collections.unmodifiableCollection(new ArrayList<String>(data));
        System.out.println(c); // чтение разрешено
        // ! c.add("one"); // но изменение невозможно.


        List<String> a = Collections.unmodifiableList(new ArrayList<String>(data));
        ListIterator<String> lit = a.listIterator();
        System.out.println(lit.next()); // чтение разрешено
        // ! lit.add("one"); // но изменение невозможно.


        Set<String> s = Collections.unmodifiableSet(new HashSet<String>(data));
        System.out.println(s); // чтение разрешено
        // s.add("one"); // но изменение невозможно.


        // Для SortedSet:
        Set<String> ss = Collections.unmodifiableSortedSet(new TreeSet<>(data));
        System.out.println(ss); // чтение разрешено
        // ss.add("one"); // но изменение невозможно.


        Map<String, String> m = Collections.unmodifiableMap(new HashMap<String, String>(Countries.capitals(6)));
        System.out.println(m);  // чтение разрешено
        // m.add("one", "two"); // но изменение невозможно.


        // Для SortedMap:
        Map<String, String> sm = Collections.unmodifiableSortedMap(new TreeMap<String, String>(Countries.capitals(6)));
        System.out.println(sm); // чтение разрешено
        // sm.add("one"); // но изменение невозможно.

    }

}
