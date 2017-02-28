package Problems.Chapter11_Collections.j_CollectionAndIterator;

import java.util.*;

/**
 * Created by SashaKhyzhun on 3/1/17. Page 354
 */
public class InterfaceVsIterator {

    public static void display(Iterator<String> it) {
        while (it.hasNext()) {
            String pet = it.next();
            System.out.println("qwerty : " + pet + " ");
        }
        System.out.println();
    }

    public static void display(Collection<String> pets) {
        for (String p : pets) {
            System.out.println("qwerty : " + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> petList = new ArrayList<>(8);
//        petList.add("Eric");
//        petList.add("Marta");
//        petList.add("Jorge");
//        petList.add("Max");
//        petList.add("Elvis");

        Set<String> petSet = new HashSet<>(petList);
        Map<String, String> petMap = new LinkedHashMap<>();

        String[] names = ("Ralph, Eric, Robin, Lacey, " +
                          "Britney, Sam, Spot, Fluffy").split(", ");

        for (int i = 0; i < names.length; i++) {
            petMap.put(names[i], petList.get(i));
        }

        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());

        System.out.println(petMap);
        System.out.println(petMap.keySet());

        display(petMap.values());
        display(petMap.values().iterator());
    }

}
