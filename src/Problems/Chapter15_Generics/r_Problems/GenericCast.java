package Problems.Chapter15_Generics.r_Problems;

/**
 * @author SashaKhyzhun on 3/15/17. Page 564.
 * Приведения типа и предупреждения.
 *
 * Использоване приведения типов и instanceof с обобщенным параметром-типом
 * ни к чему не привод. Следующий контейнер хранит во внутреннем представлении
 * как Object и преобразует их к типу T при чтении.
 */

class FixedSizeStack<T> {
    private int index = 0;
    private Object[] storage;

    public FixedSizeStack(int size) {
        storage = new Object[size];
    }

    public void push(T item) {
        storage[index++] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) storage[--index];
    }

}

public class GenericCast {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<String>(SIZE); //<<--- Object of Integer
        for (String s : "A B C D E F G H I J".split(" ")) {
            strings.push(s);
        }

        for (int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }

    }

}
