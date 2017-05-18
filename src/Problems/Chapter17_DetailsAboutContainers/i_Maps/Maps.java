package Problems.Chapter17_DetailsAboutContainers.i_Maps;

import Problems.Chapter17_DetailsAboutContainers.c_Abstract.CountingMapData;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author SashaKhyzhun on 5/17/17. Page 671.
 * Производительность.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Класс / интерфейс *                               Описание                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * HashMap"          * Релизация карты на основе хеш-таблицы (используйте весто устаревшего    *
 *                   * класса Hashtable). Поиск и вставка пар занимает небольше постоянное     *
 *                   * время. Производительность можно настроить, указав в конструкторах       *
 *                   * особые значения для емкости и коэффициента загрузки                     *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * LinkedHashMapDemo     * Похожа на HashMap, однако при переборе выдает пары в порядке их     *
 *                   * добавления, или согласно принциу LRU ("наименее используемые идут       *
 *                   * первыми", least-recently-used). Лишь немногом медленнее HashMap, за     *
 *                   * исключением процесса перечисления элементов, где она быстрее за счет    *
 *                   * внутреннего связанного спискаа, отвечающего за хранение порядка         *
 *                   * добавления элементов                                                    *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * TreeMap           * Реализаци карты на базе красно-черного дерева. При просмотре ключей или *
 *                   * пар видно, что они соблюдают определенный порядок (который определяется *
 *                   * интерфейсами Comparable или Comparator). Область применения карты       *
 *                   * TreeMap - выдача результатов в отсортированном виде. Карта ThreeMap -   *
 *                   * единственная карта с методом subMap(), который позволяет выделять из    *
 *                   * карты некоторую ее часть                                                *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * WeakHashMap       * Карта, состоящая из "слабых" ключей, которые не препятствуют            *
 *                   * освобождению объектов, на которые ссылается карта; разработана для      *
 *                   * решения определенного класса задач. Если за пределами карты ссылок      *
 *                   * на ключ нет, он может быть удален уборщиком мусора                      *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * ConcurrentHashMap * Потоково-безопасная версия Map, не используюзая сигхронизационную       *
 *                   * блокировку                                                              *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * IdentityHashMap   * Хеш-таблица, искользующая для сравнения ключей оператор == вместо       *
 *                   * equals(). Применяется в особых случаях, не для рядовых целей            *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 *
 */

// операции с картами.
public class Maps {

    public static void printKeys(Map<Integer, String> map) {
        System.out.print("Size = " + map.size() + ", ");
        System.out.println("Keys: ");
        System.out.println(map.keySet()); // создрание множества ключей
    }
    public static void test(Map<Integer, String> map) {
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        map.putAll(new CountingMapData(25)); // Map реализует поведение "Set" для ключей

        System.out.println(map);

        // Создание коллекции значений:
        System.out.println("Values: ");
        System.out.println(map.values());
        System.out.println("map: " + map);

        System.out.println("map.containsKey(11): " + map.containsKey(11));
        System.out.println("map.containsValue(\"F0\"): " + map.containsValue("F0"));

        Integer key = map.keySet().iterator().next();
        System.out.println("First key in map: " + key);

        map.remove(key);
        System.out.println(map);

        map.clear();
        System.out.println("map.isEmpty(): " + map.isEmpty());

        // Операции с Set измегяют Map:
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }

    public static void main(String[] args) {
        test(new HashMap<Integer, String>());
        test(new TreeMap<Integer, String>());
        test(new LinkedHashMap<>());
        test(new IdentityHashMap<>());
        test(new ConcurrentHashMap<>());
        test(new WeakHashMap<>());
    }


}
