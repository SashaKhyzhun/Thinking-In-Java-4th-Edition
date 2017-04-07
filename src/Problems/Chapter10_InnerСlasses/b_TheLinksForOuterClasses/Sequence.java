package Problems.Chapter10_InnerСlasses.b_TheLinksForOuterClasses;

/**
 * Created by SashaKhyzhun on 1/15/17. Page 290
 * Ссылки на внешний класс.
 */

// Хранение последовательности Object.
// Знакомство с паттерном "Итератор"
interface Selector {
    boolean end();
    Object current();
    void next();
}

// Класс-объертка для массива с элементами Object, имеющего фиксированный размер
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }
    // Добавление нового объекта в конец последовательности
    // (при наличии свободного места в массиве)
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() {
            return i == items.length;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }



    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}