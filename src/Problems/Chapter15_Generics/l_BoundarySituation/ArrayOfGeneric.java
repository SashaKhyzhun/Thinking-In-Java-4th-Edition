package Problems.Chapter15_Generics.l_BoundarySituation;

/**
 * @author SashaKhyzhun on 3/14/17. Page 541.
 * Так как все массивы имеют одинаковую структуру (размер
 * каждой ячейки массива и размещение в памяти) независимо
 * от хранимого типа, казалось бы, вы можете создать массив
 * Object и привести его к нужному типу. Такое решение компилируется,
 * но не работает, выдавая исклчюение ClassCastException.
 */
public class ArrayOfGeneric {

    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Компилируется: выдает ClassCastException:
        gia = (Generic<Integer>[])new Generic[SIZE];
        // Тип времени выполнения - низноуровневый (стертый) тип:

        System.out.println(gia.getClass().getSimpleName());

        gia[0] = new Generic<Integer>();
        // ! gia[1] = new Object(); // Ошибка времени компиляции
        // ! gia[2] = new Generic<Double>(); // Обнаружевается не соответствие типов

    }

}
