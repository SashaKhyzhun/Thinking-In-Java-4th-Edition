package Problems.Chapter15_Generics.x_LatentTyping;

/**
 * @author SashaKhyzhun on 4/7/17. Page 582 (so much interesting information)
 *
 * Неявная типизация, латентная типизация или утиная типизация (англ. Duck typing) — вид динамической типизации,
 * применяемой в некоторых языках программирования (D, Perl, Smalltalk, Python, Objective-C, Ruby, JavaScript,
 * Groovy, ColdFusion, Boo, Lua, Go), которая позволяет полиморфно работать с объектами, которые не связаны в
 * иерархии наследования, но имеют необходимый набор методов. То есть считается, что объект реализует интерфейс,
 * если он содержит все методы этого интерфейса, независимо от связей в иерархии наследования и принадлежности к
 * какому-либо конкретному классу.
 */

interface Performs {
    void speak();
    void sit();
}
class Dog {}
class Robot {}

// в Java нет латентной типизации
class PerformingDog extends Dog implements Performs {
    @Override public void speak() { System.out.println("Woof!"); }
    @Override public void sit() { System.out.println("Sitting"); }
    void reproduce() {}
}
class PerformingRobot extends Robot implements Performs {
    @Override public void speak() { System.out.println("Click!"); }
    @Override public void sit() { System.out.println("Clank!"); }
    void oilChange() {}
}

class Communicate {
    /* Однако следует заметить, что для работы perform() не обязательно
       использовать обобщения. Можно просто передать объект Performs */
    public static <T extends Performs> void perform(T performer) {
        performer.speak();
        performer.sit();
    }
}
class CommunicateSimply {
    public static void Perform(Performs performs) {
        performs.speak();
        performs.sit();
    }
}
public class DogsAndRobots {
    public static void main(String[] args) {
        PerformingDog d = new PerformingDog();
        PerformingRobot r = new PerformingRobot();
        Communicate.perform(d);
        Communicate.perform(r);
        System.out.println("-----------------\nSimply:\n");
        CommunicateSimply.Perform(d);
        CommunicateSimply.Perform(r);
    }
}
