package Problems.Chapter10_InnerСlasses.j_MultiNestingAccess;

import static javax.print.attribute.standard.MediaSizeName.B;

/**
 * Created by SashaKhyzhun on 1/20/17. Page 306
 * Доступ вовне из многократно вложенных классов.
 * Неважно, настолько глубоко был вложен внутренний класс, - у него есть непосредственный
 * доступ ко вмем членам всех классов, в которые он встроен. (!) Проиллюстрируем это
 * следующей программой:
 */

// Вложенные классы могут обращаться ко всем членам
// всех уровней классов, в которые они вложены.

class MNA {
    private void f() {};

    class A {
        private void g() {}

        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();

    }
}
