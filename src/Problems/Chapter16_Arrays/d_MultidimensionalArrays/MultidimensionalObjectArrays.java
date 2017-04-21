package Problems.Chapter16_Arrays.d_MultidimensionalArrays;

import Problems.Chapter16_Arrays.BerylliumSphere;

import java.util.Arrays;

/**
 * @author SashaKhyzhun on 4/21/17. Page 610.
 *
 * Следующий пример показывает, как объеденить
 * несколько выражений new в фигурных скобках:
 */
public class MultidimensionalObjectArrays {

    public static void main(String[] args) {

        BerylliumSphere[][] spheres = {
                { new BerylliumSphere(), new BerylliumSphere() },

                { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() },

                { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() },
        };

        System.out.println(Arrays.deepToString(spheres));

    }

}
