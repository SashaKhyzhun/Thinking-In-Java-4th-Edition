package Problems.Chapter8_Polymorphism.PrivateOverride;

import static com.sun.deploy.trace.Trace.print;

/**
 * Created by SashaKhyzhun on 12/12/16.
 */
public class PrivateOverride {

    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }

}

class Derived extends PrivateOverride {

    public void f() {
        System.out.println(("public f()"));
    }

}

