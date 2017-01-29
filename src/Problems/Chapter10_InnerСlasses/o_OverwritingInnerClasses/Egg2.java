package Problems.Chapter10_InnerСlasses.o_OverwritingInnerClasses;

/**
 * Created by SashaKhyzhun on 1/29/17. Page 319
 * Правильное наследование внутреннего класса.
 */

public class Egg2 {
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }
        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }
    private Yolk y = new Yolk();
    public Egg2() {
        System.out.println("new Egg2()");
    }
    public void insertYolk(Yolk yy) { y = yy; }
    public void g() { y.f(); }
}

class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }
        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }
    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2(); // восходящее преобразование
        e2.g();
    }
}
