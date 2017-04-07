package Problems.Chapter09_Interfaces.i_NestedInterfaces;

/**
 * Created by SashaKhyzhun on 1/13/17. Страница 283.
 * Интерфейсы могут вкладываться в классы и в другие интерфейсы. При этом
 * обнаруживается несколько весьма интересных сообенностей:
 */

class A {

    interface B { void f(); }
    public  class BImp implements  B { public void f() {} }
    private class BImp2 implements B { public void f() {} }

    public interface C { void f(); }
    public  class CImp  implements C { public void f() {} }
    private class CImp2 implements C { public void f() {} }

    private interface D { void f(); }
    private class     DImp  implements D { public void f() {} }
    public  class     DImp2 implements D { public void f() {} }

    public  D getD() { return new DImp2(); }
    private D dRef;
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G { void f(); } // Интерфейс в интерфейсе
    public interface H { void f(); } // Избыточное объявление public:
    void g();
    //! private interface I {} // Не может быть private внутри интерфейса:
}

public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {}
    }
    class CImp implements A.C {
        public void f() {}
    }
    // Нельзя реалиловать private-интерфейс, кроме как внутри класса, где он был определен:
    //!class DImp implements A.D {
    //!    public void f() {}
    //!}
    class EImp  implements E {
        public void g() {}
    }
    class EGImp implements E.G {
        public void f() {}
    }
    class EImp2 implements E {
        public void g() {}
    }
    class EG implements E.G {
        public void f() {}
    }

    public static void main(String[] args) {
        A a = new A();
        // Нет доступа к A.D:
        //! A.D ad = a.getD();
        // Не возвращает ничего, кроме A.D:
        //! A.DImp2 di2 = a.getD();
        // Нельзя получить доступ к члену интерфейса:
        //! a.getD().f();
        // Только другой класс А может использовать getD():
        A a2 = new A();
        a2.receiveD(a.getD());

    }
}

