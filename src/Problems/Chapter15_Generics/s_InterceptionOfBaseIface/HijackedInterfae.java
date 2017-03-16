package Problems.Chapter15_Generics.s_InterceptionOfBaseIface;

/**
 * @author SashaKhyzhun on 3/15/17. Page 566.
 * Есть смысл сузить тип, с которым может сравниваться субкласс CompartablePet.
 * Например, Cat может сравниваться только с другими объектами Cat:
 */

// {CompileTimeError}
//class Cat extends ComparablePet implements Comparable<Cat> {
//    // ошибка: Comparable не может следоваться
//    // с разными аргументами: <Cat> или <Pet>
//
//    @Override
//    public int compareTo(Cat o) {
//        return 0;
//    }
//
//}


/**
 * К сожалению, это решение не сработает. Когда для Comparable устанавливается
 * аргумент ComparablePet, ни один реализующий класс не может сравниться ни с чем,
 * кроме ComparablePet (RestrictedComparablePets.java)
 */

public class HijackedInterfae {
}
