package Problems.Chapter19_Enumerations.e_RealizationNotExtending;

import java.util.Random;

/**
 * @author SashaKhyzhun on 8/28/17.
 * Page 819.
 */
public class Enums {

    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<?> ec) {
        return random((T[]) ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }

}
