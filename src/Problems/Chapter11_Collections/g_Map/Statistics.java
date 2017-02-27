package Problems.Chapter11_Collections.g_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by SashaKhyzhun on 2/27/17. Page 347.
 *
 */
public class Statistics {

    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10000; i++) {
            // produce a number between 0 and 20:
            int randomInt = random.nextInt(20);
            Integer freq = map.get(randomInt);
            map.put(randomInt, (freq == null) ? (1) : (freq + 1));
        }

        System.out.println(map);
    }

}
