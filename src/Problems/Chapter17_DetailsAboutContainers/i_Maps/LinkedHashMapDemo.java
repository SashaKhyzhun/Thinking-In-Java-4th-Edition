package Problems.Chapter17_DetailsAboutContainers.i_Maps;

import Problems.Chapter17_DetailsAboutContainers.c_Abstract.CountingMapData;

import java.util.LinkedHashMap;

/**
 * @author SashaKhyzhun on 5/18/17.
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>(new CountingMapData(9));
        System.out.println(linkedMap);

        // порядок LRU:
        linkedMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedMap.putAll(new CountingMapData(9));
        System.out.println(linkedMap);

        for (int i = 0; i < 6; i++) { // Обрщение к элементам
            linkedMap.get(i);
        }
        System.out.println(linkedMap);
        linkedMap.get(0);
        System.out.println(linkedMap);


    }


}
