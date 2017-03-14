package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 542.
 * Из-за стирания типов массива во время выполнения может быть только Object[].
 * Если немедленно привести его к T[], то при компиляции фактический тип массива
 * теряется, и компилятор может упустить некоторые потенциальные проверки ошибок.
 * По этой причине в коллекции лучше использовать Object[], а выполнять приведение
 * к <T> при использовании элемента массива. Посмотрим это на практике:
 */
public class GenericArray2<T> {
    private Object[] array;

    public GenericArray2(int size) {
        array = new Object[size];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index];
    }

    @SuppressWarnings("unchecked")
    public T[] rep() {// предупреждение: неконтролируемое приведение типа. Не хорошо.
        return (T[]) array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> gai = new GenericArray2<Integer>(10);
        for (int i = 0; i < 10; i++) {
            gai.put(i, i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(gai.get(i) + " ");
        }

        try {
            Integer[] ia = gai.rep();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
