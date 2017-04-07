package Problems.Chapter08_Polymorphism.EueueForConstuctors;

/**
 * Created by SashaKhyzhun on 1/5/17.
 */


class Meal { Meal() { System.out.println("Meal()"); } }
class Bread { Bread() { System.out.println("Bread()"); } }
class Cheese { Cheese() { System.out.println("Cheese()"); } }
class Lettuce { Lettuce() { System.out.println("Lettuce()"); } }

class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()"); }
}

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }

    /*
     * Мы вызываем sandwich, который наследует portable lunch, который в свою очередь
     * наследует lunch, а тот уже meal, и вызывается с самого дальнего конструктора т.е. так:
     * * Meal()
     * * Lunch()
     * * PortableLunch()
     *
     * здесь наследование закончилось и в классе мы вызывает следующие классы:
     * * Bread()
     * * Cheese()
     * * Lettuce()
     *
     * а в конце концов наш конструктор:
     * * Sandwich()
     */

//    /*
//     * Meal()
//     * Lunch()
//     * PortableLunch()
//     * Bread()
//     * Cheese()
//     * Lettuce()
//     * Sandwich()
//     */

}
