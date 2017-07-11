package Problems.Chapter17_DetailsAboutContainers.j_HashAndHashCodes;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SashaKhyzhun on 5/18/17. page 675.
 * Какая же будет погода?
 */
public class SpringDetector {

    // Используем Groundhog или класс, производный от него:
    public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundhog, Predication> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(ghog.newInstance(i), new Predication());
        }

        System.out.println("map = " + map);

        Groundhog gh = ghog.newInstance(3);
        System.out.println("Looking up predication for " + gh);
        if (map.containsKey(gh)) {
            System.out.println(map.get(gh));
        } else {
            System.out.println("Key not found: " + gh);
        }

    }


    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog.class);

        Constructor<Integer> a = int.class.getConstructor(int.class);
    }

}
