package Problems.Chapter15_Generics.u_CovarianceArgs;

/**
 * @author SashaKhyzhun on 3/16/17.
 */

class GenericSetter<T> {//Без самоограничения
    void set(T arg) {
        System.out.println("GenericSetter.set(Base)");
    }
}

class DerivedGS extends GenericSetter<Base> {
    void set(Derived derived) {
        System.out.println("DerivedGC.set(Derived)");
    }
}

public class PlayinGenericInheritance {

    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS dgs = new DerivedGS();

        dgs.set(derived);
        dgs.set(base); // Компилируется: перегрузка, не переопределение!
    }

}
