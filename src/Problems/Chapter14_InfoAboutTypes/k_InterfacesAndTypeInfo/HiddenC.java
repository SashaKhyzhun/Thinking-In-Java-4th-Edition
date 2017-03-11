package Problems.Chapter14_InfoAboutTypes.k_InterfacesAndTypeInfo;

/**
 * @author SashaKhyzhun on 3/11/17.
 */

class C implements A {
    @Override
    public void f() {
        System.out.println("public C.f()");
    }
    public void g() {
        System.out.println("public.C.g()");
    }

    void u() {
        System.out.println("package C.u()");
    }
    protected void v() {
        System.out.println("protected C.v()");
    }
    private void w() {
        System.out.println("private C.w()");
    }

}

public class HiddenC {
    public static A makeA() {
        return new C();
    }

    // Здесь интересно то, что даже если makeA() будет возвращать C,
    // за пределами пакета не удастся использовать ничего кроме A,
    // так как имя С вне пакета будет недоступно
}



