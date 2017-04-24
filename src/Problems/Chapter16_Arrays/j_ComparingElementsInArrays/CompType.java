package Problems.Chapter16_Arrays.j_ComparingElementsInArrays;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;
import Problems.Chapter16_Arrays.g_UsingGeneratorToCreateArrays.Generated;
import Problems.Chapter16_Arrays.i_ComparingArrays.ComparingArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author SashaKhyzhun on 4/24/17. Page 627.
 * Сравнение элементов массивов.
 *
 * Реализация Comparable в классе.
 */
public class CompType implements Comparable<CompType> {

    private static int count = 1;
    int i, j;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        if (count++ % 3 == 0) result += "\n";
        return result;
    }

    @Override
    public int compareTo(CompType rv) {
        return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
    }

    private static Random random = new Random(47);

    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(random.nextInt(100), random.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], generator());
        System.out.println("before:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);

        System.out.println("After:");
        System.out.println(Arrays.toString(a));

    }

}
