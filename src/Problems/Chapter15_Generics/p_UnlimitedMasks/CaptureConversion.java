package Problems.Chapter15_Generics.p_UnlimitedMasks;

import Problems.Chapter15_Generics.n_Masks.Holder;

/**
 * @author SashaKhyzhun on 3/15/17. Page 560.
 * Фиксация.
 *
 * Есть ситуация, в которой использование <?> вместо неспециализированного
 * типа особенно принципиально. Если передать неспециализированный тип методу,
 * использующему <?>, компилятор может автоматически вычислить фактический параметртип
 * и вызвать другой метод, использующий точный тип.
 *
 * Следующий пример демонстрирует работу этого механизма, который называется
 * фиксацией (capture conversion), потому что неуказанный тип маски фиксируется и
 * преобразуется к точному типу. В этом случае комментарии о предупреждениях
 * действуют только при удалении аннотации
 * (a)Suppresswarnings:
 *
 * Фиксация -   неуказанный тип маски фиксируется и
 * преобразуется к точному типу. В этом случае комментарии о предупреждениях
 * действуют только при удалении аннотации
 * (a)Suppresswarnings:
 */
public class CaptureConversion {

    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder); // вызов с зафиксированным типом
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        //f1(raw); // Выдает предупреждения
        f2(raw);   // Без предупреждений

        Holder rawBasic = new Holder();
        //rawBasic.set(new Object()); // Предупреждение
        f2(rawBasic); // Без предупреждений

        // Восходящее преобразование к Holder<?>, тип все равно определяется правильно:
        Holder<?> wildCarded = new Holder<Double>(1.0);
        f2(wildCarded);

    }

}
