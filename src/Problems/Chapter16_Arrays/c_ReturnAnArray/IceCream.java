package Problems.Chapter16_Arrays.c_ReturnAnArray;

import Problems.Chapter16_Arrays.BerylliumSphere;

import java.util.Arrays;
import java.util.Random;

/**
 * @author SashaKhyzhun on 4/21/17. Page 607.
 * Возврат массива.
 * Пример возврата массивов из методом.
 */
public class IceCream {

    private static Random random = new Random(47);
    static final String[] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip",
            "Mocha Almond Fudge", "Rum Raisin", "Praline Cream", "Mud Pie"
    };

    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("Set too big");
        }

        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = random.nextInt(FLAVORS.length);
            } while (picked[t]);
            results[i] = FLAVORS[t];
            picked[t] = true;
        }

        return results;
    }

    private static BerylliumSphere[] qwerty(int n) {
        BerylliumSphere[] results = new BerylliumSphere[n];
        for (int i = 0; i < results.length; i++) {
            results[i] = new BerylliumSphere();
        }
        return results;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }

}
