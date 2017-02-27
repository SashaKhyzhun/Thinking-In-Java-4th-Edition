package Problems.Chapter11_Collections.g_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SashaKhyzhun on 2/28/17. Page 348.
 * Контейнеры Map, как и массивы и Collection, легко расширяются до нескольких измерений;
 * достаточно создать контейнер Map, значениями которого являются контейнеры Map (значениями
 * которых могут быть другие контейнеры, в том числе и другие контейнеры Map).
 * Предположим, нам надо хранить информацию о людях, у каждого из которых может быть несколько
 * домашних животных, - для этого достаточно создать контейнер Map<Person, List<Pet>>:
 */
public class MapOfList {

    public static Map<String, List<String>> petPeople = new HashMap<>();

    static {
        petPeople.put("Dawn", Arrays.asList("Molly", "Sharik"));

        petPeople.put("Kate", Arrays.asList("Shackleton", "Elsie May"));

        petPeople.put("Issac", Arrays.asList("Luke", "Marilyn", "Sausage"));

        petPeople.put("Liza", Arrays.asList("Freckly", "Fizzy", "Qwerty"));
    }

    public static void main(String[] args) {
        System.out.println("People : " + petPeople.keySet());
        System.out.println("Pets   : " + petPeople.values());

        for (String people : petPeople.keySet()) {
            System.out.println(people + " has:");
            for (List<String> pet : petPeople.values()) {
                System.out.println("      " + pet);
            }
        }
    }

}
