package Problems.Chapter15_Generics.e_GenericMethods;

/**
 * @author SashaKhyzhun on 3/13/17. Page 512
 */
public class GenericMethods {

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <A extends Number, B extends String, C extends Integer> void g(A a, B b, C c) {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }

    public <A, B, C> void u(A a, B b, C c) {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        System.out.println("f(): ");
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);

        System.out.println("g(): ");
        gm.g(2.0, "Opa", 1);

        System.out.println("u(): ");
        gm.u("QWE", 123, true);
    }


}
