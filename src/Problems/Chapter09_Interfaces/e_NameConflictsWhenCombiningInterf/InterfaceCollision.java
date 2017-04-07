package Problems.Chapter09_Interfaces.e_NameConflictsWhenCombiningInterf;
// Конфликты имен при совмещении интерфейсов. Страница 278

interface I1 { void f (); }
interface I2 { int  f (int i); }
interface I3 { int  f (); }

class C {
    public int f() {
        return 1;
    }
}
class C2 implements I1, I2 {
    public void f() {}
    public int  f(int i) {
        return 1; // перегружен
    }
}
class C3 extends C implements I2 {
    public int f(int i) {
        return 1; // перегружен
    }
}
class C4 extends C implements I2 {
    // Идентичны, все нормально:
    public int f(int i) {
        return 1;
    }
}

/** Uncomment this lines if you wanna have a problems */
// Методы различаются только по типу возвращаемого значения:
//! class C5 extends C implement I1 {}
//! interface I4 extends I1, I3 {} ///:~
/** * * * * * * * * * * * * * * * * * * * * * * * * * */

public class InterfaceCollision {
    /** * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * f() в С не может реализовать f() в I1;                *
     * попытка использовать несовместимые возвращаемые типы  *
     * обнаружено: int                                       *
     * требуется: void                                       *
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * интерфейсы I3 и I1 несовместимы.                      *
     * оба определяют f(),                                   *
     * но с различными возвращаемыми типами                  *
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * так и живем...                                        *
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

}
