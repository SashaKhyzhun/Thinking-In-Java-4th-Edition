package Problems.Chapter11_Collections.i_PriorityQueue;

import Problems.Chapter11_Collections.h_Queue.QueueDemo;

import java.util.*;

/**
 * Created by SashaKhyzhun on 2/28/17. Page 351.
 * В приоритетной очереди PriorityQueue следующим извлекается элемент, обладающий
 * найвысшим приоритетом. Например, в аэропорту клиент может быть обслужен вне очереди,
 * если его самолет готовится к вылету. В системе передачи сообщений некоторые сообщения
 * могут содержать более важную информацию; они должны быть срочно обработаны независимо
 * от времени поступления.
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue); // рандомные числа по возрастанию

        ///////////////////////////////////////////////////////////////////

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<Integer>(ints);
        QueueDemo.printQ(priorityQueue); // псевдорандом по возрастанию
        priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue); // псевдорандом по спаданию

        ///////////////////////////////////////////////////////////////////

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";

        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
        QueueDemo.printQ(stringPQ); // все буквы в фразе по алфавиту вперед
        stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ); // все буквы в фразе по алфавиту назад

        ///////////////////////////////////////////////////////////////////

        Set<Character> charSet = new HashSet<Character>();
        for (char c : fact.toCharArray()) {
            charSet.add(c); // autoboxing :)
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
        QueueDemo.printQ(characterPQ); // все буквы в фразе по алфавиту без повтора так как 'set'




    }

}
