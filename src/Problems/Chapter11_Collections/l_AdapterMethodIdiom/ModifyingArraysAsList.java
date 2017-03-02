package Problems.Chapter11_Collections.l_AdapterMethodIdiom;

import java.util.*;

/**
 * Created by SashaKhyzhun on 3/2/17. Page 360
 */
public class ModifyingArraysAsList {

    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] ia = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list1 = new ArrayList<>(Arrays.asList(ia));

        System.out.println("До перемешивания    : " + list1);

        Collections.shuffle(list1, random);
        System.out.println("После перемешивания : " + list1);
        System.out.println("Массив:             : " + Arrays.toString(ia));

        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("До перемешивания    : " + list2);
        Collections.shuffle(list2, random);
        System.out.println("После перемешивания : " + list2);
        System.out.println("Массив:             : " + Arrays.toString(ia));


    }


}
