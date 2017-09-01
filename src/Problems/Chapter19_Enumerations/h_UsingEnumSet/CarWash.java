package Problems.Chapter19_Enumerations.h_UsingEnumSet;

import java.util.EnumSet;

/**
 * @author SashaKhyzhun on 9/1/17.
 * Page 830.
 */
public class CarWash {

    public enum Cycle {
        UNDERBODY {
            void action() { print("Spraying the underbody"); }
        },
        WHEELWASH {
            void action() { print("Washing the wheels"); }
        },
        PREWASH {
            void action() { print("Loosening the dirt"); }
        },
        BASIC {
            void action() { print("The basic wash"); }
        },
        HOTWAX {
            void action() { print("Applying hot wax"); }
        },
        RINSE {
            void action() { print("Rinsing"); }
        },
        BLOWDRY {
            void action() { print("Blowing dry"); }
        };

        abstract void action();
    }

    EnumSet<Cycle> cycles = EnumSet.of(Cycle.BASIC, Cycle.RINSE);
    public void add(Cycle cycle) { cycles.add(cycle); }

    public void washCar() {
        for(Cycle c : cycles)
            c.action();
    }

    public String toString() { return cycles.toString(); }

    public static void main(String[] args) {
        CarWash wash = new CarWash();
        print("1: " + wash);
        wash.washCar();
        print("2: " + wash);
        // Order of addition is unimportant:
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.BLOWDRY); // Duplicates ignored
        wash.add(Cycle.RINSE);
        wash.add(Cycle.HOTWAX);
        print("3: " + wash);
        wash.washCar();
    }

    private static void print(Object o) {
        System.out.println(o.toString());
    }
}