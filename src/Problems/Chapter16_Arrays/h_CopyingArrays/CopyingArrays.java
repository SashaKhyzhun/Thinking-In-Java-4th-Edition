package Problems.Chapter16_Arrays.h_CopyingArrays;

import java.util.Arrays;

/**
 * @author SashaKhyzhun on 4/21/17. Page 624.
 * Копирование массива.
 *
 * В стандартной библиотеке аа имеется статический (static) метод
 * с именем system. аггаусору, который способен гораздо быстрее
 * копировать массивы, чем получается в случае «ручного» копирования
 * элементов в цикле for.
 *
 * Метод System.аггаусору() перегружен для всех нужных типов.
 * Следующий пример манипулирует массивами целых чисел (int):
 */
public class CopyingArrays {

    public static void main(String[] args) {

        int[] i = new int[7];
        int[] j = new int[10];

        Arrays.fill(i, 47);
        Arrays.fill(j, 99);

        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));


        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("j = " + Arrays.toString(j));


        int[] k = new int[5];
        Arrays.fill(k, 103);
        System.arraycopy(i, 0, k, 0, k.length);
        System.out.println("k = " + Arrays.toString(k));

        // Objects:
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];

        Arrays.fill(u, new Integer(47));
        Arrays.fill(v, new Integer(99));

        System.out.println("u = " + Arrays.toString(u));
        System.out.println("v = " + Arrays.toString(v));

        System.arraycopy(v, 0, u, 0, v.length);
        System.out.println("u = " + Arrays.toString(u));


    }
}
