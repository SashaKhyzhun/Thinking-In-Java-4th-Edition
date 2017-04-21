package Problems.Chapter16_Arrays.a_SpecialRelationToArrays;

import Problems.Chapter16_Arrays.BerylliumSphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SashaKhyzhun on 4/21/17. Page 603.
 * Пример: массивы сравниваются с обобщенными контейнерами.
 *
 *
 * Оба способа хранения объектов обеспечивают проверку типов.
 * Единственное очевидное отличие состоит в том, что массивы
 * используют для обращения к элементам конструкцию [],
 * а List -- такие методы, как add() и get(). Сходство между
 * массивами и ArrayList не случайно; это было сделано так,
 * чтобы разработчику было концептуально проще переключаться
 * между ними. Но как было показано в главе 11, по
 * функциональности и контейнеры заметно превосходят массивы.
 *
 */

public class ContainerComparison {

    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
        System.out.println("");

        List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
        for (int i = 0; i < 5; i++) {
            sphereList.add(new BerylliumSphere());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));
        System.out.println("");


        int[] integers = { 0, 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);
        System.out.println("");

        List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
        intList.add(97);
        System.out.println(intList);
        System.out.println(intList.get(4));


    }

}
