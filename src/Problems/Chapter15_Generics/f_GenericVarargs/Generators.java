package Problems.Chapter15_Generics.f_GenericVarargs;

import Problems.Chapter15_Generics.d_GenericInteface.Coffee;
import Problems.Chapter15_Generics.d_GenericInteface.CoffeeGenerator;
import Problems.Chapter15_Generics.d_GenericInteface.Fibonacci;
import Problems.Chapter15_Generics.d_GenericInteface.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author SashaKhyzhun on 3/13/17. Page 516
 * Вспоматальный класс для работы с Generator.
 *
 * Обобщенный метод для использования с генераторами.
 */
public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(
                new ArrayList<Coffee>(),
                new CoffeeGenerator(),
                4
        );

        for (Coffee c : coffee) {
            System.out.println(c);
        }

        Collection<Integer> fnumbers = fill(
                new ArrayList<Integer>(),
                new Fibonacci(),
                12
        );

        for (int i : fnumbers) {
            System.out.print(i + ", ");
        }

    }

}
