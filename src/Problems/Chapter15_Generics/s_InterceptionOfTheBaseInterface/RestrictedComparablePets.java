package Problems.Chapter15_Generics.s_InterceptionOfTheBaseInterface;

import java.lang.reflect.Method;

/**
 * @author SashaKhyzhun on 3/15/17. Page 566.
 * Класс Hamster показывает, что возможно повторно реализовать интерфейс,
 * присутствующий в ComparablePet, - при условии его точного совпадения,
 * включая параметры-типы.
 */

class Hamster extends ComparablePet implements Comparable<ComparablePet> {

    public int compareTo(ComparablePet arg) {
        return 0;
    }
}

public class RestrictedComparablePets {
}
