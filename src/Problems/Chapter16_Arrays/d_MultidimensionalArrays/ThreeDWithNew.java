package Problems.Chapter16_Arrays.d_MultidimensionalArrays;

import java.util.Arrays;

/**
 * @author SashaKhyzhun on 4/21/17. Page 609.
 * Трехмерный массив в выражении new:
 */
public class ThreeDWithNew {
    public static void main(String[] args) {

        // 3-D array with fixed length:
        int [][][] a = new int[2][2][8];
        System.out.println(Arrays.deepToString(a));


    }
}
