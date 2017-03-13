package Problems.Chapter15_Generics.a_SimpleGenerics;

/**
 * @author SashaKhyzhun on 3/13/17.
 */
class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}

class SimpleGeneric1 {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
        System.out.println(value2);

        // Здесь повторяется ошибка предыдущего фрагмента кода
        //! Integer intValue2 = value2.getValue();
    }
}
