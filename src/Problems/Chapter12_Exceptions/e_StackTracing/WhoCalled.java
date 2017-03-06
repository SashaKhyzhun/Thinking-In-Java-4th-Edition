package Problems.Chapter12_Exceptions.e_StackTracing;

/**
 * Created by SashaKhyzhun on 3/6/17. Page 379
 * Демонстрация трассировки данных:
 */
public class WhoCalled {

    static void f() {
        // Генерируем исключение для заполения трассировки стека

        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g() { f(); }
    static void h() { g(); }

    public static void main(String[] args) {
        f();
        System.out.println("----------------------------");
        g();
        System.out.println("----------------------------");
        h();
    }

}
