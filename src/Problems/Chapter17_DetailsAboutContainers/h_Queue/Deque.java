package Problems.Chapter17_DetailsAboutContainers.h_Queue;

import java.util.LinkedList;

/**
 * @author SashaKhyzhun on 5/17/17. Page 666.
 * Деки.
 * Дек (двусторонняя очередь) ведет себя как очередь, но с возможностью
 * добавления и удаления элементов с обоих концов. В LinkedList имеются
 * методы поддержки операций дека, но явно определенного интерфейса для
 * деков в стандартных библиотеках Java не существует. Таким образом,
 * Linkedlist не может реализовать этот интерфейс, и вы не можете выполнить
 * восходящее преобразование к интерфейсу Deque (в отличие от интерфейса
 * ее в предыдущем примере). Впрочем, класс Deque можно создать посредством
 * композиции и просто предоставить доступ к соответствующим методам из LinkedList:
 *
 * Создание Deque из LinkedList.
 */
public class Deque<T> {

    private LinkedList<T> deque = new LinkedList<T>();

    public void addFirst(T e) {
        deque.addFirst(e);
    }

    public void addLast(T e) {
        deque.addLast(e);
    }

    public T getFirst() {
        return deque.getFirst();
    }

    public T getLast() {
        return deque.getLast();
    }

    public T removeFirst() {
        return deque.removeFirst();
    }

    public T removeLast() {
        return deque.removeLast();
    }

    public int size() {
        return deque.size();
    }

    @Override
    public String toString() {
        return deque.toString();
    }

    // и другие методы по мере необходимости...
}
