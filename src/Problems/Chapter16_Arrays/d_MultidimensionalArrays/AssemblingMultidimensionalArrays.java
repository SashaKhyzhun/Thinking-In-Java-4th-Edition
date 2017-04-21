package Problems.Chapter16_Arrays.d_MultidimensionalArrays;

import java.util.Arrays;

/**
 * @author SashaKhyzhun on 4/21/17. Page 611.
 * Создание многомерных массивов.
 *
 * А вот как происходит последовательное построение непримитивных объектов:
 */
public class AssemblingMultidimensionalArrays {

    public static void main(String[] args) {

        Integer[][] a;
        a = new Integer[3][];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer[3];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i * j; // Автоматическая упаковка.
            }
        }

        System.out.println(Arrays.deepToString(a));

    }

}
