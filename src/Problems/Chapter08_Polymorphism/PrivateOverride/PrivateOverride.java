package Problems.Chapter08_Polymorphism.PrivateOverride;

/**
 * Created by SashaKhyzhun on 12/12/16.
 */

// Проблема "переопределения" закрытых методов.
// закрытый (private) метод автоматически является неизменным (final),
// а заодно и скрытым от производного класса


public class PrivateOverride {

    private void f() {
        System.out.println("private f()");
    }
    public void omg() {
        System.out.println("public omg()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }

}

class Derived extends PrivateOverride {

    @Override
    public void omg() {
        super.omg();
    }

    public void f() {
        System.out.println(("public f()"));
    }
    private void u() {
        System.out.println(("public f()"));
    }
    public void m() {
        System.out.println(("public f()"));
    }
    private void w() {
        System.out.println(("public f()"));
    }

}

