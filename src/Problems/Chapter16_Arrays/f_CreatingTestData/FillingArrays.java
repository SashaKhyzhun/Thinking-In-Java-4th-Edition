package Problems.Chapter16_Arrays.f_CreatingTestData;

import java.util.Arrays;

/**
 * @author SashaKhyzhun on 4/21/17. Page 614.
 * Arrays.fill().
 *
 * Класс Arrays из стандартной библиотеки Java содержит
 * довольно незамысловатый метод fill() - одно значение
 * просто копируется во все ячейки массива, или, в случае
 * с объектами, копируется одна и та же ссылка. Пример:
 */
public class FillingArrays {

    public static void main(String[] args) {

        int size = 6;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];
        short[] a4 = new short[size];
        int[] a5 = new int[size];
        long[] a6 = new long[size];
        float[] a7 = new float[size];
        double[] a8 = new double[size];
        String[] a9 = new String[size];

        Arrays.fill(a1, true);
        System.out.println("a1 = " + Arrays.toString(a1));

        Arrays.fill(a2, (byte)11);
        System.out.println("a2 = " + Arrays.toString(a2));

        Arrays.fill(a3, 'x');
        System.out.println("a3 = " + Arrays.toString(a3));

        Arrays.fill(a4, (short) 17);
        System.out.println("a4 = " + Arrays.toString(a4));

        Arrays.fill(a5, 19);
        System.out.println("a5 = " + Arrays.toString(a5));

        Arrays.fill(a6,23);
        System.out.println("a6 = " + Arrays.toString(a6));

        Arrays.fill(a7, 29);
        System.out.println("a7 = " + Arrays.toString(a7));

        Arrays.fill(a8, 47);
        System.out.println("a8 = " + Arrays.toString(a8));

        Arrays.fill(a9, 3, 5, "Word");
        System.out.println("a9 = " + Arrays.toString(a9));

    }
}
