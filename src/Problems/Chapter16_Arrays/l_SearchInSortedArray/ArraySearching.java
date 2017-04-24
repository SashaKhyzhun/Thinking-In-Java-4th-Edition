package Problems.Chapter16_Arrays.l_SearchInSortedArray;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;
import Problems.Chapter16_Arrays.f_CreatingTestData.RandomGenerator;
import Problems.Chapter16_Arrays.g_UsingGeneratorToCreateArrays.ConvertTo;
import Problems.Chapter16_Arrays.g_UsingGeneratorToCreateArrays.Generated;

import java.util.Arrays;

/**
 * @author SashaKhyzhun on 4/24/17. Page 631.
 * Поиск в отсортированном массиве.
 *
 *
 */
public class ArraySearching {

    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer(1000);
        int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
        Arrays.sort(a);
        System.out.println(("Sorted array: " + Arrays.toString(a)));

        while(true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            if(location >= 0) {
                System.out.println("Location of " + r + " is " + location + ", a[" + location + "] = " + a[location]);
                break; // Out of while loop
            }
        }

    }


}

/* Output:
Sorted array: [128, 140, 200, 207, 258, 258, 278, 288, 322, 429, 511, 520, 522, 551, 555, 589, 693, 704, 809, 861, 861, 868, 916, 961, 998]
Location of 322 is 8, a[8] = 322
*///:~