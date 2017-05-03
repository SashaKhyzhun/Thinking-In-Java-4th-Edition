package Problems.Chapter17_DetailsAboutContainers.d_;

import java.util.*;

/**
 * @author SashaKhyzhun on 5/1/17.
 */
/* Basic integer array version */
public class Labka5 {

    /**
     * Computes the next lexicographical permutation of the specified array of integers in place,
     * returning whether a next permutation existed. (Returns {@code false} when the argument
     * is already the last possible permutation.)
     * @param array the array of integers to permute
     * @return whether the array was permuted to the next permutation
     */
    public static int[] nextPermutation(int[] array) {
        // Find non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i])
            i--;
        if (i <= 0)
            return array;

        // Find successor to pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1])
            j--;
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // Reverse suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }

    /**
     * Insertion Sort Method for Descending Order.
     */
    public static int[] doInsertionSort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }



    public static void main(String[] args) {
        System.out.println("Input your length of array");
        Scanner input = new Scanner(System.in);
        // Create a new array. The user enters the size
        int[] array = new int[input.nextInt()];

        System.out.println("Input your integers");
        // Get the value of each element in the array
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();


        System.out.println("Find 'next' or 'all'?");
        String answer = input.next();


        switch (answer) {
            case "next":
                System.out.println("Next lexicographical permutation: " + Arrays.toString(nextPermutation(array)));
                break;
            case "all":
                array = doInsertionSort(array);
                System.out.println("");

                int[] temp = new int[array.length];
                int i = 0;

                while (!Arrays.equals(array, temp)) {   // 1 2 3 != 1 3 2
                    i++;
                    System.out.println("lexicographical permutation #" + i + " = " + Arrays.toString(array));
                    temp = array.clone();               // 1 2 3
                    array = nextPermutation(array);     // 1 3 2
                }

                break;
            default:
                System.out.println("Wrong operation");
                break;
        }



    }


}
