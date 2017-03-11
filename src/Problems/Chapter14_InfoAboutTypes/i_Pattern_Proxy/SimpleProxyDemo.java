package Problems.Chapter14_InfoAboutTypes.i_Pattern_Proxy;

/**
 * Created by SashaKhyzhun on 3/10/17. Page 484
 */

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}
class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }
    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }
    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer (Interface iface) {
        iface.doSomething();
        iface.somethingElse("boo-boo-boo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}


