package Problems.Chapter5_InitialisationAndFinalize.Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by SashaKhyzhun on 1/6/17.
 */


// Создание массивов оператором new;

public class ArrayNew {

    public static void main(String[] args) {

        Random random = new Random(100);

        int[] a = new int[random.nextInt(20)];

        System.out.println("Длина а = " + a.length);
        System.out.println(Arrays.toString(a));
    }

}
