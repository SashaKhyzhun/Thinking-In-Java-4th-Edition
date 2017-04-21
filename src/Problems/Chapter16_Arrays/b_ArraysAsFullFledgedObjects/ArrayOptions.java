package Problems.Chapter16_Arrays.b_ArraysAsFullFledgedObjects;

import java.util.Arrays;

/**
 * @author SashaKhyzhun on 4/21/17. Page 604.
 * Массивы как полноценные объекты.
 * Инициализация и повторное присваивание массивов.
 *
 * Следующий пример демонстрирует разные способы инициализации массивов и то,
 * как ссылки на массивы связываются с разными объектами массивов.
 * Также демонстрируется, что массив простейших типов и массив объектов
 * практически идентичны в использовании. Единственное отличие состоит в том,
 * что массив объектов содержит ссылки на них,
 * в то время как в массиве примитивов хранятся реальные значения.
 *
 */

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Sphere " + id;
    }
}

public class ArrayOptions {

    public static void main(String[] args) {

        /** Массив объектов */
        BerylliumSphere[] a; // Локальная неинициализированная переменная
        BerylliumSphere[] b = new BerylliumSphere[5]; // Ссылки в массиве автоматически инициализируются null;
        System.out.println("b: " + Arrays.toString(b));

        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) // можно проверить ссылку на null
                c[i] = new BerylliumSphere();
        }

        // Групповая инициализация:
        BerylliumSphere[] d = { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() };

        // Динамическая групповая инициализация:
        a = new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere() };

        // (Завершающая запятая в обоих случаях не обязательна)
        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);
        a = d;
        System.out.println("a.length = " + a.length);

        /** Массивы примитовов */
        int[] e; // Null-ссылка
        int[] f = new int[5];

        // Примитивы в массиве автоматически инициализируются нулями:
        System.out.println("f: " + Arrays.toString(f));
        int[] g = new int[4];
        for (int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }
        int[] h = { 11, 47, 93 };

        // System.out.println(e.length); // ошибка: потому что не инициализировано
        System.out.println("f.length = " + f.length);
        System.out.println("g.length = " + g.length);
        System.out.println("h.length = " + h.length);
        e = h;
        System.out.println("e.length = " + e.length);
        e = new int[] { 1, 2 };
        System.out.println("e.length = " + e.length);




    }


}
