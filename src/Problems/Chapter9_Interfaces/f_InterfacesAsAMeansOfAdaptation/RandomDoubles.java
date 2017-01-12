package Problems.Chapter9_Interfaces.f_InterfacesAsAMeansOfAdaptation;

import java.util.Random;

/**
 * Created by SashaKhyzhun on 1/13/17. Страница 280.
 * Допустим, у нас имеется класс, не реализующий интерфейс Readable, - как заставить
 * его работать с Scanner? Перед вами пример класса, генерирующего вещественные числа:
 */
public class RandomDoubles  {

    private static Random random = new Random(47);
    public double next() { return random.nextDouble(); }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }


}
