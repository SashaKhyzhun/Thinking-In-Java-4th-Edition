package Problems.Chapter15_Generics.g_SetOperations;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @author SashaKhyzhun on 3/13/17. Page 522.
 */
public class ContainerMethodDifferences {

    static Set<String> methodSet(Class<?> type) {
        Set<String> result = new TreeSet<String>();
        for(Method m : type.getMethods()) {
            result.add(m.getName());
        }
        return result;
    }

    static void interfaces(Class<?> type) {
        System.out.println("Interfaces in " + type.getSimpleName() + ": ");
        List<String> result = new ArrayList<String>();
        for (Class<?> c : type.getInterfaces()) {
            result.add(c.getSimpleName());
        }
        System.out.println(result);
    }

    static Set<String> object = methodSet(Object.class);

    static {
        object.add("close");
    }

    static void difference(Class<?> superset, Class<?> subset) {
        System.out.println(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");

        Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
        comp.removeAll(object); // Не показывать методы 'Object'
        System.out.println(comp);

        interfaces(superset);
    }

    public static void main(String[] args) {
        System.out.println("Collection: " + methodSet(Collection.class));
        System.out.println();
        interfaces(Collection.class);
        System.out.println();
        difference(Set.class, Collection.class);
        System.out.println();
        difference(HashSet.class, Set.class);
        System.out.println();
        difference(LinkedHashSet.class, HashSet.class);
        System.out.println();
        difference(TreeSet.class, Set.class);
        System.out.println();
        difference(ArrayList.class, List.class);
        System.out.println();
        difference(LinkedList.class, List.class);
        System.out.println();
        difference(Queue.class, Collection.class);
        System.out.println();
        difference(PriorityQueue.class, Queue.class);
        System.out.println();
        System.out.println();
        System.out.println("Map: " + methodSet(Map.class));
        System.out.println();
        System.out.println();
        difference(HashMap.class, Map.class);
        System.out.println();
        difference(LinkedHashMap.class, HashMap.class);
        System.out.println();
        difference(SortedMap.class, Map.class);
        System.out.println();
        difference(TreeMap.class, Map.class);
    }

}
