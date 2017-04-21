package Problems.Chapter16_Arrays.d_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author SashaKhyzhun on 4/21/17. Page 609.
 *
 * Векторы массивов, образующих матрицу, могут иметь произвольную длину
 * (так называемые `ступенчастые массивы`).
 */
public class RaggedArray {

    public static void main(String[] args) {
        Random random = new Random(47);
        int[][][] a = new int[random.nextInt(7)][][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[random.nextInt(5)][];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new int[random.nextInt(5)];
            }
        }

        System.out.println(Arrays.deepToString(a));
    }

}
