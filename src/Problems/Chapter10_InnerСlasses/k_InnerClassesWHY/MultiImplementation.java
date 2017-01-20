package Problems.Chapter10_InnerСlasses.k_InnerClassesWHY;

/**
 * Created by SashaKhyzhun on 1/21/17. Page 308
 * При использовании конкретных или абстрактных классов
 * внутренние классы предоставляют единственный способ
 * провести "множественное наследование реализации".
 */

class D {}
abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {};
    }
}

public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
