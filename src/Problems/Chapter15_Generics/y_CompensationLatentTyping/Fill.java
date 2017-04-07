package Problems.Chapter15_Generics.y_CompensationLatentTyping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author SashaKhyzhun on 4/7/17. Page 591.
 *
 * Если нужный интерфейс отсутствует.
 *
 * Обобщение идеи FilledList.
 * Не работает с "любым объектом, содержащим add()". Интерфейса "Addable" не существует, так
 * что приходится использовать Collections. В данном случае полноценное обобщение невозможно.
 */
public class Fill {
    public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++) {
            // Предполагается наличие конструктора по умолчанию:
            try {
                collection.add(classToken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Contract {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() { return getClass().getName() + " " + id; }
}

class TitleTransfer extends Contract {}

class FillText {
    public static void main(String[] args) {

        List<Contract> contracts = new ArrayList<Contract>();
        Fill.fill(contracts, Contract.class, 3);
        Fill.fill(contracts, TitleTransfer.class, 2);

        for (Contract c : contracts) {
            System.out.println(c);
        }

        SimpleQueue<Contract> contractQueue = new SimpleQueue<Contract>();

        // Не сработает. Метод fill() недостаточно обобщен:
        // Fill.fill(contractQueue, Contract.class, 3);
    }
}

