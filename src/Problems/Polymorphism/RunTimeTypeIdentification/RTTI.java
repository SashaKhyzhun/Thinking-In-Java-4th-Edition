package Problems.Polymorphism.RunTimeTypeIdentification;

/**
 * Created by SashaKhyzhun on 1/5/17.
 */

// Страница 260
// НИСХОДЯЩЕЕ преобразование и динамическое определение типов (RTTI).
// {ThrowException}


class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void u() {
        System.out.println("yo");
    }
    public void v() {}
    public void w() {}
}

public class RTTI {

    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[0].g();

        x[1].g();
        x[1].f();

        // >>>>>> MoreUseful m = (MoreUseful) x[1];
        // >>>>>> m.u();

        // Стадия компиляции: метод не найдет в классе Useful: x[1].u();

        // ((MoreUseful)x[1]).u();  - Нисходящее преобразование / RTTI
        // ((MoreUseful)x[0]).u();  - Происходит исключение
    }
}
