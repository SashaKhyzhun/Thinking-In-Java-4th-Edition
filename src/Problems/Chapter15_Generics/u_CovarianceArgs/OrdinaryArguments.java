package Problems.Chapter15_Generics.u_CovarianceArgs;

/**
 * @author SashaKhyzhun on 3/16/17. Page 571.
 * В необобщенном коде типы аргументов нельзя заставить изменяться с подтипами:
 */
class OrdinarySetter {
    void set(Base base) {
        System.out.println("OrdinarySetter.set(Base)");
    }
}

class DerivedSetter extends OrdinarySetter {
    void set(Derived derived) {
        System.out.println("DerivedSetter.set(Derived)");
    }
}

public class OrdinaryArguments {

    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedSetter ds = new DerivedSetter();
        //OrdinarySetter os = new OrdinarySetter();

        ds.set(derived);
        ds.set(base); // Компилируется: перегрузка, не переопределение!

        //os.set(base);
        //os.set(derived);

    }
}
