package Problems.Chapter15_Generics.r_Problems;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;

import java.util.Random;

/**
 * @author SashaKhyzhun on 3/15/17. Page 563.
 */

class FArray {
    public static <T> T[] fill(T[] t, Generator<T> gen) {
        for (int i = 0; i < t.length; i++) {
            t[i] = gen.next();
        }
        return t;
    }
}

public class PrimitiveGenericTest {

    public static void main(String[] args) {
        Random random = new Random();

        String[] strings = FArray.fill(new String[7], new Generator<String>() {
            @Override public String next() { return String.valueOf(random.nextInt()); }
        });

        for (String s : strings) {
            System.out.print(s);
        }

        //......
    }

}
