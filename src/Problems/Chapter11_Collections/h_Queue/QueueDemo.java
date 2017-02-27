package Problems.Chapter11_Collections.h_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by SashaKhyzhun on 2/28/17. Page 350
 * Класс LinkedList содержит несколько методов для поддержки поведения очередей и реализует
 * интерфейс Queue; соответственно, LinkedList может использоваться как реализация Queue.
 * Восходящее преобразование LinkedList в Queue позволяет использовать в этом примере
 * методы, специфические для Queue:
 */
public class QueueDemo {

    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i + 10));
        }
        printQ(queue);

        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }

    /**
     * Медот .offer() относится к числу методов, специфических для Queue; он вставляет
     * элемент в конец очереди или возвращает false.
     *
     * Методы peek() и element() возвращают элемент в начале очереди без его извлечения, но
     * peek() возвращает null для пуской очереди, а
     * element() выдает исключение NoSuchElementException.
     *
     * Методы poll() и remove() извлекают и возвращают элемент в начале очереди, но
     * poll() возвращает null для пустой очереди, а
     * remove() выдает исключение NoSuckElementException.
     */

}
