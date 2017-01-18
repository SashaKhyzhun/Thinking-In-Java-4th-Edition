package Problems.Chapter10_InnerСlasses.g_AgainAboutPatterFactory;

/**
 * Created by SashaKhyzhun on 1/19/17. Page 301.
 * Пример анонимных внутренних классов в паттерне "Фабрика".
 */
interface Service {
    void method1();
    void method2();
}
interface ServiceFactory {
    Service getService();
}
class Implementation1 implements Service /*,ServiceFactory*/ {
    private Implementation1() {}
    @Override
    public void method1() {
        System.out.println("Imp1, method1");
    }
    @Override
    public void method2() {
        System.out.println("Imp1, method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override // анонимный класс как бы
        public Service getService() {
            return new Implementation1();
        }
    };
    //@Override public Service getService() { return new Implementation1(); }
}
class Implementation2 implements Service {
    private Implementation2() {}
    @Override
    public void method1() {
        System.out.println("Imp2, method1");
    }
    @Override
    public void method2() {
        System.out.println("Imp2, method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}

public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}