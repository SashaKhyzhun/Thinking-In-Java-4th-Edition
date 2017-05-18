package Problems.Chapter17_DetailsAboutContainers.i_Maps;

import Problems.Chapter17_DetailsAboutContainers.c_Abstract.CountingMapData;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author SashaKhyzhun on 5/18/17. Page 673.
 * Если вы используете отсортированную карту типа SortedMap (к ней относится один
 * класс TreeMap),все ключи гарантированно следуют в определенном порядке, что
 * позволяет определить в интерфейсе SortedMap несколько дополнительных методов.
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Comparator comparator(): * возвращает интерфейс Comparator для сравнения объектов данной карты или  *
 *                          * null для естественного упорядочивания.                                   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * T firstKey():            * производит наименьшее значение ключа.                                    *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * T lastKey():             * производит наибольшее значение ключа.                                    *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * SortedMap subMap         * возвращает подкарту данной карты (Map), начиная с ключа fromKey          *
 * (fromKey, toKey)         * (включительно) и заканчивая ключом toKey (не включая).                   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * SortedMap headMap        * возвращает подкарту данной карты Map, содержащую включи, больше или      *
 * (toKey)                  * равные fromKey.                                                          *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * SortedMap tailMap        * возвращает подкарту данной карты Map, содержащую ключи, больше или       *
 * (fromKey)                * равне fromKey.                                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 */
public class SortedMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> sortedMap = new TreeMap<>(new CountingMapData(10));
        System.out.println("sortedMap: " + sortedMap);

        Integer low = sortedMap.firstKey();
        Integer high = sortedMap.lastKey();

        System.out.println("low: " + low);
        System.out.println("high: " + high);

        Iterator<Integer> it = sortedMap.keySet().iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) low = it.next();
            if (i == 6) high = it.next();
            else it.next();
        }
        System.out.println("low after for: " + low);
        System.out.println("high after for: " + high);

        System.out.println("sortedMap.subMap(low, high): " + sortedMap.subMap(low, high));
        System.out.println("sortedMap.headMap(high):     " + sortedMap.headMap(high));
        System.out.println("sortedMap.tailMap(low):      " + sortedMap.tailMap(low));

    }

}
