package Problems.Chapter15_Generics.u_CovarianceArgs;

/**
 * @author SashaKhyzhun on 3/16/17. Page 570.
 * Ковариантность аргументов.
 *
 * Полезность самоограничиваемых аргументов заключается в том, что они производят
 * ковариантные типы аргументов -- типы аргументов методов меняются в соответствии с субклассами.
 *
 * И хотя самоограничиваемые типы также производят возвращаемые типы, соответствующие типу субкласса,
 * это не так важно, потому что ковариантные возвращаемые типы были представлены в Jave SЕ5:
 */

class Base {}
class Derived extends Base {}

interface OrdinaryGetter {
    Base get();
}

interface DerivedGetter extends OrdinaryGetter {
    // Возвращаемый тип переопределенного метода может изменяться:
    Derived get();
}

public class CovariantReturnTypes {
    void test(DerivedGetter d) {
        Derived d2 = d.get();
    }
}
