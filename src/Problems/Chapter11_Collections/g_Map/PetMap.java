package Problems.Chapter11_Collections.g_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by SashaKhyzhun on 2/27/17. Page 347.
 * Следующий пример позволяет использовать описание в формате String для поиска
 * объектов Pet. Он также показывает, как проверить присутствие ключа или значения
 * в контейнере Map методами containsKey() и containsValue():
 */
public class PetMap {

    public static void main(String[] args) {
        Map<String, String> petMap = new HashMap<>();

        petMap.put("My Cat", "Molly");
        petMap.put("My Dog", "Ginder");
        petMap.put("My Hamster", "Bosco");

        System.out.println(petMap);

        String dog = petMap.get("My Dog");
        System.out.println(dog);

        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));

    }

}
