package Problems.Chapter9_Interfaces.f_InterfacesAsAMeansOfAdaptation;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by SashaKhyzhun on 1/13/17. Страница 280.
 * Мы снова можем воспользоваться паттерном "Адаптер", но на этот раз адаптируемый класс
 * создается наследованием и реализацией интерфейса Readable. Псевдомножественное
 * наследование, обеспечиваемое ключевым словом interface, позволяет создать новый класс,
 * который одновременно является и RandomDoubles, и Readable:
 */

// Создание адаптера посредствам наследование.

public class AdapterRandomDoubles extends RandomDoubles implements Readable {

    private int count;
    public AdapterRandomDoubles(int count) { this.count = count; }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }

        String result = Double.toString(next()) + " ";
        cb.append(result);

        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdapterRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.println(s.nextDouble() + " ");
        }

    }

}
