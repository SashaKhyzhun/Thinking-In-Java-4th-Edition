package Problems.Chapter14_InfoAboutTypes.k_InterfacesAndTypeInfo;

/**
 * @author SashaKhyzhun on 3/11/17.
 * Программирование в обход интерфейса.
 */

class B implements A {
    // это с класса А
    @Override
    public void f() {}
    // это с класса B
    public void g() {}
}

public class InterfaceViolation {

    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // Ошибка компиляции
        // mb tak: ---> ((B) a).g();

        System.out.println(a.getClass().getName());

        if (a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }

}
