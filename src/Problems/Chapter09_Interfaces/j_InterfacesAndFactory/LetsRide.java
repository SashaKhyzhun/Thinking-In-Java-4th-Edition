package Problems.Chapter09_Interfaces.j_InterfacesAndFactory;
/**
 * Created by SashaKhyzhun on 1/14/17.
 * Exercise
 */
interface Cycle { String getName(); }
interface CycleFactory { Cycle getCycle(); }
/*--------------------------------------------------------------------*/
class Unicycle implements Cycle {
    public String getName() {
        System.out.println("Wroom-Wroom mazafaka on the " + getClass().getSimpleName());
        return getClass().getSimpleName();
    }
}
class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Unicycle(); }
}
/*--------------------------------------------------------------------*/
class Bicycle implements Cycle {
    public String getName() {
        System.out.println("Wroom-Wroom mazafaka on the " + getClass().getSimpleName());
        return getClass().getSimpleName();
    }
}
class BicycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Bicycle(); }
}
/*--------------------------------------------------------------------*/
class Tricycle implements Cycle {
    public String getName() {
        System.out.println("Wroom-Wroom mazafaka on the " + getClass().getSimpleName());
        return getClass().getSimpleName();
    }
}
class TricycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Tricycle(); }
}
/*--------------------------------------------------------------------*/
public class LetsRide {
    public static void ride(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.getName();
    }
    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory ());
        ride(new TricycleFactory());
    }
}