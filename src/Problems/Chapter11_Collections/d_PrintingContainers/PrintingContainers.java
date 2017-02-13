package Problems.Chapter11_Collections.d_PrintingContainers;

import java.util.*;

/**
 * Created by SashaKhyzhun on 2/10/17. Page 331.
 * Для создания печатного представления массива необходимо использовать Arrays.toString(),
 * но контейнеры запросто выводятся без постронней помощи. Следуюзий пример также
 * демонстрирует использование основных типов контейнеров:
 */

// Контейнеры распечатываются автоматически.

public class PrintingContainers {
    static Collection fill (Collection<String> collection) {
        collection.add("1 крыса");
        collection.add("2 кошка");
        collection.add("3 собака");
        collection.add("4 слон");
        collection.add("5 волк");
        return collection;
    }
    static Map fill (Map<String, String> map) {
        map.put("1 крыса",  "Анфиса");
        map.put("2 кошта",  "Мурка");
        map.put("3 собака", "Шарик");
        map.put("4 слон",   "Пушок");
        map.put("5 волк",   "Снежок");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));

        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));

        System.out.println(" ");
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));


    }
}
