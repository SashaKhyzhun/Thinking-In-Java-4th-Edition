package Problems.Chapter17_DetailsAboutContainers.a_FillingArrays;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;

import java.util.ArrayList;

/**
 * @author SashaKhyzhun on 4/24/17. Page 638.
 * Решение с Generator.
 *
 * Практически все подтипы Collection имеют конструктор, который получает другой объект Collection,
 * используемый для заполнения нового контейнера. Таким образом, для простого создания тестовых
 * данных достаточно построить класс с конструктором, в аргументах которого передается
 * объект Generator (см. главы 15 и 1б) и количество объектов quantity:
 */
public class CollectionData<T> extends ArrayList<T> {

    public CollectionData(Generator<T> generator, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(generator.next());
        }
    }

    // Обобщенный вспомагательный метод:
    public static <T> CollectionData<T> list(Generator<T> generator, int quantity) {
        return new CollectionData<T>(generator, quantity);
    }

}
