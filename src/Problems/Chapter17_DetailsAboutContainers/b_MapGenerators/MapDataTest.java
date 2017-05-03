package Problems.Chapter17_DetailsAboutContainers.b_MapGenerators;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;
import Problems.Chapter16_Arrays.f_CreatingTestData.CountingGenerator;
import Problems.Chapter16_Arrays.f_CreatingTestData.RandomGenerator;

import java.util.Iterator;

/**
 * @author SashaKhyzhun on 4/25/17. Page 642.
 * Пример использования MapData.
 */

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override public Pair<Integer, String> next() {
        return new Pair<Integer, String>(number++, "" + letter++);
    }

    @Override public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override public boolean hasNext() { return number < size; }
            @Override public Integer next() { return number++; }
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
}

public class MapDataTest {

    public static void main(String[] args) {

        // Генератор Pair:
        System.out.println(MapData.map(new Letters(), 11));

        // Два разных генератора:
        System.out.println(MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(3), 8));

        // Геренатор ключей и одно значение
        System.out.println(MapData.map(new CountingGenerator.Character(), "Value", 6));

        // Iterable и генератор значений:
        System.out.println(MapData.map(new Letters(), new RandomGenerator.String(3)));

        // Iterable и одно значение:
        System.out.println(MapData.map(new Letters(), "Pop"));

    }

}
