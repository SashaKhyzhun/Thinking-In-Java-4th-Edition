package Problems.Chapter15_Generics.u_CovarianceArgs;

/**
 * @author SashaKhyzhun on 3/16/17. Page 571.
 * Самоограничиваемое обобщение действительно производит для
 * возвращаемого значения точный производный тип, как видно из get():
 */

interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}

interface Getter extends GenericGetter<Getter> {}


public class GenericsAndReturnTypes {
    void test(Getter g) {
        Getter result = g.get();
        GenericGetter gg = g.get(); // Также базовый тип.
    }
}
