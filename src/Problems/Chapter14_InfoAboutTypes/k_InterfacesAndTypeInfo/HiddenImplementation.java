package Problems.Chapter14_InfoAboutTypes.k_InterfacesAndTypeInfo;


import java.lang.reflect.Method;

/**
 * @author SashaKhyzhun on 3/11/17. Page 496
 */
public class HiddenImplementation {

    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getSimpleName());

        // Ошибка компиляции: не удается найти имя 'C':
        /*if (a instanceof C) {
            C c = (C)a;
            c.g();
        }*/

        System.out.println("================");
        // Сюрприз! Отражение позволяет вызывать g():
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");

    }

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);

    }

}
