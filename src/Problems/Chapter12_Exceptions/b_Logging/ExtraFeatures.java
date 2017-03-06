package Problems.Chapter12_Exceptions.b_Logging;

/**
 * Created by SashaKhyzhun on 3/6/17.
 */

class MyException2 extends Exception {
    private int x;
    public MyException2() {}
    public MyException2(String msg) { super(msg); }
    public MyException2(String msg, int x) { super(msg); this.x = x; }

    public int val() { return x; }
    public String getMessage() { return "Подробное сообщение: " + x + " " + super.getMessage(); }
}

class BoykovException extends Exception {
    private int y;
    public BoykovException() {}
    public BoykovException(String msg) { super(msg); }
    public BoykovException(String msg, int y) { super(msg); this.y = y; }
    public int getY() { return y; }
    public String getMessage() { return "Ванька накосячил с: " + super.getMessage() + " " + y + " раз"; }
}

public class ExtraFeatures {

    public static void f() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из g()");
        throw new MyException2("Создано в g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из h()");
        throw new MyException2("Создано в h()", 47);
    }

    static void b() throws BoykovException {
        System.out.println("Ванька зашел в Эган");
        throw new BoykovException("Выпить пиво залпом", 228);
    }

    public static void main(String[] args) {

        try { f(); } catch (MyException2 e) { e.printStackTrace(System.out); }

        try { g(); } catch (MyException2 e) { e.printStackTrace(System.out); }

        try { h(); } catch (MyException2 e) { e.printStackTrace(System.out); System.out.println("e.val() = " + e.val()); }

        try { b(); } catch (BoykovException e) { e.printStackTrace(System.out); }

    }

}
