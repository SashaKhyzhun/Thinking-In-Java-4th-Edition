package Problems.Chapter12_Exceptions.f_RethrowingException;

/**
 * Created by SashaKhyzhun on 3/6/17. Page 380
 * Повторное возбуждение исключения заставляет его перейти в распоряжение обработчика
 * исключений более высокого уровня. Все последующие блоки catch текущего блока try
 * игнорируются. + вся информация из объекта предоставляющего исключение сохраняется
 * в обработчике более высокого уровня.
 */
public class Rethrowing {

    public static void f() throws Exception {
        System.out.println("Создание исключения в f()");
        throw new Exception("возбуждено из f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("В методе g(), e.printStackTrace()");
            e.printStackTrace();
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("В методе h(), e.printStackTrace()");
            e.printStackTrace();
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }

}
