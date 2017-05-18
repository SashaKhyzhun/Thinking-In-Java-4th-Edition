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
        collection.add("крыса");
        collection.add("кошка");
        collection.add("собака");
        collection.add("кошка");
        collection.add("слон");
        return collection;
    }
    static Map fill (Map<String, String> map) {
        map.put("крыса",  "Анфиса");
        map.put("кошка",  "Мурка");
        map.put("собака", "Шарик");
        map.put("кошка",  "Рыжик");
        map.put("слон",   "Пушок");
        return map;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList     : " + fill(new ArrayList<String>()));
        System.out.println("LinkedList    : " + fill(new LinkedList<String>()));

        System.out.println(" ");
        System.out.println("HashSet       : " + fill(new HashSet<String>()));
        System.out.println("TreeSet       : " + fill(new TreeSet<String>()));
        System.out.println("LinkedHashSet : " + fill(new LinkedHashSet<String>()));

        System.out.println(" ");
        System.out.println("HashMap       : " + fill(new HashMap<String, String>()));
        System.out.println("TreeMap       : " + fill(new TreeMap<String, String>()));
        System.out.println("LinkedHashMapDemo : " + fill(new LinkedHashMap<String, String>()));



    }
}
