package Problems.Chapter15_Generics.u_CovarianceArgs;

/**
 * @author SashaKhyzhun on 3/16/17. Page 573.
 * Однако с самоограничиваемыми типами в производном классе содержится только
 * один метод, в аргументе которого передается производный, а не базовый тип:
 */

interface SelfBoundSetter<T extends SelfBoundSetter<T>> {
    void set(T arg);
}

interface Setter extends SelfBoundSetter<Setter> {}

public class SelfBoundingAndCovariantArguments {
    void testA(Setter s1, Setter s2, SelfBoundSetter sbs) {
        s1.set(s2);
        // s1.set(sbs); // Ошибка:
        // set(Setter) в SelfBoundSetter<Setter>
        // не может применяться к (SelfBoundSetter).
    }

    /**
     * Компилятор не распознает попытку передачи в аргументе set() базового типа,
     * потому что метода с такой сигнатурой не существует. Фактически аргумент
     * был переопределен.
     */
}
