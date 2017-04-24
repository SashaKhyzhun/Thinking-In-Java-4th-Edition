package Problems.Chapter16_Arrays.f_CreatingTestData;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;

/**
 * @author SashaKhyzhun on 4/21/17. Page 617.
 *
 * Тестовая программа использует отражение с идиомой вложенного
 * генератора, что позволяет использовать ее для тестировния любого
 * набора генераторов, построенных по определенной форме:
 */
public class GeneratorsTest {

    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) { // для всех классов внутри класса.
            System.out.print(type.getSimpleName() + ": ");
            try {
                Generator<?> g = (Generator<?>) type.newInstance(); // создаем заново класс ?
                for (int i = 0; i < size; i++)
                    System.out.print(g.next() + " "); // выводим данные с метода next() внутри каждого класса
                System.out.println("");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        // метод test() создает экземпляр каждого из этих генераторов и
        // выводит результат, полученный при десятикратном вызове next();
        test(RandomGenerator.class);
    }

}
