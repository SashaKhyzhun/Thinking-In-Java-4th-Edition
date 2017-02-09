package Problems.Chapter11_Collections.b_MainConceptsofCollections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by SashaKhyzhun on 2/8/17. Page 328.
 * Интерфейс Collection обобщает концепцию последовательности - способа хранения
 * группы объектов.
 *
 * Следующий пример заполняет объект Collection (представленный классов ArrayList)
 * объектами Integer и выводит каждый элемент в полученном контейнере:
 */
public class SimpleCollections {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i); // auto упаковка
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }

}
