package Problems.Chapter17_DetailsAboutContainers.o_SynchronizationCollections;

import java.util.*;

/**
 * @author SashaKhyzhun on 8/8/17.
 */
public class Synchronization {

    public static void main(String[] args) {

        Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        Set<String> s = Collections.synchronizedSet(new HashSet<>());
        Set<String> ss = Collections.synchronizedSortedSet(new TreeSet<>());
        Map<String, String> m = Collections.synchronizedMap(new HashMap<>());
        Map<String, String> sm = Collections.synchronizedSortedMap(new TreeMap<>());

    }

}
