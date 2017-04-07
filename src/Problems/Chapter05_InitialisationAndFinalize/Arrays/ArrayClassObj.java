package Problems.Chapter05_InitialisationAndFinalize.Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by SashaKhyzhun on 1/6/17.
 */

// Созданиие массива непримитивных объектов

public class ArrayClassObj {

    public static void main(String[] args) {

        Random random = new Random(47);

        int[] a = new int[random.nextInt(20)];

        System.out.println("Длина а = " + a.length);


        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(500);
        }
        System.out.print(Arrays.toString(a));

    }


}
