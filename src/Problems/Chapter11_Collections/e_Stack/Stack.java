package Problems.Chapter11_Collections.e_Stack;

import java.util.LinkedList;

/**
 * Created by SashaKhyzhun on 2/25/17. page 342.
 *
 * First Input, Last Output.
 *
 * В классе LinkedList имеются методы, напрямую реализующие функциональность
 * стека, поэтому вы просто используете LinkedList, не создавая для стека новый класс.
 * Впрочем, иногда отдельный класс для контейнера-стека решает задачу лучше:
 */

public class Stack<T> {

    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T t) {
        storage.addFirst(t);
    }

    public T peek() {
        return storage.peek();
    }

    public T pop() {
        return storage.pop();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }

    /**
     * <T> после имени класса сообщает компилятору, что тип является ПАРАМЕТРИЗОВАННЫМ,
     * а параметр-тип (тот, который будет заменен реальным типом при использовании
     * класса) называется т.
     *
     * По сути объявление Stack<T> означает: "Мы определяем стек для хранения объектов
     * типа Т".
     */

}
