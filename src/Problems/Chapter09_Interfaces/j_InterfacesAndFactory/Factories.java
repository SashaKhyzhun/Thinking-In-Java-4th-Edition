package Problems.Chapter09_Interfaces.j_InterfacesAndFactory;

/**
 * Created by SashaKhyzhun on 1/14/17. Страница 285.
 *
 * На концептуальном уровне интерфейс представляет собой «шлюз», ведущий к разным
 * реализациям, а типичным механизмом создания объектов, реализуюишх интерфейс,
 * является паттерн проектирования «Фабричный метод». Вместо прямого вызова
 * конструктора вызывается метод 'объекта-фарики'‚ который создает реализацию ин-
 * терфейса — таким образом код теоретически полностью изолируется от реализации
 * интерфейса, что позволяет прозрачно заменять одну реализацию другой. Следующая
 * программа демонстрирует структуру паттерна «<Фабричный метод»:
 */
// Patter Factory;
interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}
/** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
class Implementation1 implements Service {
    Implementation1() {} // Доступ в пределах пакета.
    public void method1() {
        System.out.println("Implementation1 method1");
    }
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}
class Implementation1Factory implements ServiceFactory {
    public Service getService() {
        return new Implementation1();
    }
}

/** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
class Implementation2 implements Service {
    Implementation2() {} // Доступ в пределах пакета.
    public void method1() {
        System.out.println("Implementation2 method1");
    }
    public void method2() {
        System.out.println("Implementation2 method2");
    }
}
class Implementation2Factory implements ServiceFactory {
    public Service getService() {
        return new Implementation2();
    }
}

/** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        // Реализации полностью взаимозаменямы:
        serviceConsumer(new Implementation2Factory());
    }
}
