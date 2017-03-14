package Problems.Chapter15_Generics.j_GenericErasure;

/**
 * @author SashaKhyzhun on 3/14/17. Page 529.
 * Чтобы вызывать f(), необходимо помочь обобщенному классу - передать
 * ему 'ограничение', которое сообщает компилятору, что он должен принимать
 * только типы, удовлетворяющие этому ограничению. Для этой цели снова исользуется
 * ключевое слово extends:
 */

class Manipulator<T> {
    private T object;

    public Manipulator(T t) {
        this.object = t;
    }
    // Ошибка: не удается найти метод f():
    public void manipulate() {
        //object.f();
    }
    public void gg() {
        System.out.println("Manipulator: can't get HasF.g() without extending the class");
    }

}

class Manipulator2<T extends HasF> {
    private T object;

    public Manipulator2(T t) {
        this.object = t;
    }
    public void manipulate() {
        object.f();
    }
    public void gg() {
        System.out.println("Manipulator2: " + object.g());
    }
}

class Manipulator3 {
    private HasF object;
    public Manipulator3(HasF x) {
        object = x;
    }
    public void manipulate() { object.f(); }
    public void gg() {
        System.out.println("Manipulator3: " + object.g());
    }
}

/**
 * Мы подошли к важному моменту: обобщения приносят пользу только тогда,
 * когда вы хотите использовать параметры-типы, более "универсальные", чем
 * конкретный тип (и все его подтипы), - то есть если код должен работать в
 * границах нескольких классов.
 */

public class Manipulation {
    public static void main(String[] args) {
        HasF hasF = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hasF);
        manipulator.manipulate();
        manipulator.gg();

        Manipulator2<HasF> manipulator2 = new Manipulator2<HasF>(hasF);
        manipulator2.manipulate();
        manipulator2.gg();

        Manipulator3 manipulator3 = new Manipulator3(hasF);
        manipulator3.manipulate();
        manipulator3.gg();

    }
}
