package Problems.Chapter9_Interfaces.f_InterfacesAsAMeansOfAdaptation;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by SashaKhyzhun on 1/11/17. Страница 279
 * Интерфейсы как средство адаптации.
 */

// Интерфейсы часто применяются в паттерне проектирования "Стратегия".

public class RandomWords implements Readable {

    private static Random random = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers   = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels   = "aeiou".toCharArray();
    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1; // Признак конца входных данных
        }
        cb.append(capitals[random.nextInt(capitals.length)]);

        for (int i = 0; i < 4; i++) {
            cb.append(vowels[random.nextInt(vowels.length)]);
            cb.append(lowers[random.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10; // Количество присоединенных символов
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }

    // TODO: 1/12/17 Глава 9, Интерфейсы как средство адаптации, страница 280...

}
