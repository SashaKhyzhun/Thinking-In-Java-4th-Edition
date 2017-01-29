package Problems.Chapter10_InnerСlasses.o_OverwritingInnerClasses;

/**
 * Created by SashaKhyzhun on 1/29/17. Page 318
 * Внутренний класс нельзя переопределить подобно обычному методу.
 */

class Egg {

    private Yolk y;

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }

}

public class BigEgg extends Egg {

    // we can't do it.
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }

}
