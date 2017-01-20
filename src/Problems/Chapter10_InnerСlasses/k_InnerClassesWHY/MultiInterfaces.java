package Problems.Chapter10_InnerСlasses.k_InnerClassesWHY;

/**
 * Created by SashaKhyzhun on 1/21/17. Page 307
 * Два способа реализации нескольких интерфейсов в одном классе.
 */

interface A {}
interface B {}

class X implements A, B {}

class Y implements A {
    B makeB() {
        // анонимный внутренник класс:
        return new B() {};
    }
}

public class MultiInterfaces {
    static void takesA(A a) {}
    static void takesB(B b) {}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        takesA(x); // класс Х наследует А, все ок
        takesA(y); // класс Y наследует А, все ок

        takesB(x); // класс X наследует B, все ок

        takesB(y.makeB()); // класс Y не наследует B, поэтому
                           // создаем новый анонимный внутренний
                           // класс с помощю которго можем достучатся до Б
    }
}
