package Problems.Chapter08_Polymorphism.RunTimeTypeIdentification;

/**
 * Created by SashaKhyzhun on 1/5/17.
 */

// Страница 260
// НИСХОДЯЩЕЕ преобразование и динамическое определение типов (RTTI).
// {ThrowException}


class Useful {
    public void f() {}
    public void g() {}
    public void omg() {}
    private void wtf() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void u() {
        System.out.println("yo");
    }
    public void v() {}
    public void w() {}

    @Override
    public void omg() {
        super.omg();
    }
    // wtf() не можем override-ить, потому что метод private.
}

public class RTTI {

    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),    // [0]
                new MoreUseful() // [1]
        };

        x[0].f();
        x[0].g();
        x[0].omg();
        //x[0].wtf(); // не можем потому что private

        x[1].g();
        x[1].f();
        x[1].omg(); // override

        // >>>>>> MoreUseful m = (MoreUseful) x[1];
        // >>>>>> m.u();

        // Стадия компиляции: метод не найдет в классе Useful: x[1].u();

        // ((MoreUseful)x[1]).u();  - Нисходящее преобразование / RTTI
        // ((MoreUseful)x[0]).u();  - Происходит исключение
    }
}
