package Problems.Chapter12_Exceptions.h_StandardExceptionInJava;

/**
 * Created by SashaKhyzhun on 3/6/17. Page 387.
 * Игнорирование исключений RuntimeException.
 * {ThrowsException}
 */
public class NeverCaught {

    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }

    /**
     * RuntimeException является особым случаем, так как компилятор не требует
     * для него спецификацию исключений. Вывод направляется в System.error
     *
     * Что же происходит, когда подобные исключения не перехватываются?
     * Ответ на наш вопрос выглядит так: если RuntimeException добирается до main() без перехвата,
     * то при выходе из программы для исключения вызывается метод printStackTrace().
     *
     * Помните, что исключения RuntimeException (и их подклассы) могут быть проигноированы в
     * программном коде, в то время как обработка остальных исключений обеспечивается компилятором.
     * Причина в том, что RuntimeException является следствием ошибки программиста. (например,
     * передача null или выход за рамки массива, т.е. ArrayIndexOutOfBoundsException).
     */

}
