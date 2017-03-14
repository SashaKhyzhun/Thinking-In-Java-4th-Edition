package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 541.
 *
 * Единственный успешный способ создания массива обобщенного
 * типа - создание нового массива <стертого> типа с последующим
 * приведением типа.
 *
 * Рассмотрим чуть более сложный пример. Допустим,
 * существует простая обобщенная обертка для массива:
 */
public class GenericArray<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArray(int size) { array = (T[])new Object[size]; }

    public void put(int index, T item) { array[index] = item; }

    // Предоставляет нижележащее предствление:
    public T[] rep() { return array; }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<Integer>(10);
        // приводит к возбуждению ClassCastException
        // ! Integer[] ia = gai.rep(); // runtime exception кстати

        // А это допустимо:
        Object[] oa = gai.rep();
    }
}
