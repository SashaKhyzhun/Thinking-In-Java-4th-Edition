package Problems.Chapter12_Exceptions.a_CustomExceptions;

/**
 * Created by SashaKhyzhun on 3/3/17.
 */

class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) { super(msg); }
}

class GovnoCodeException extends Exception {
    public GovnoCodeException() {}
    public GovnoCodeException(String msg) { super(msg); }
}

public class FullConstructor {

    public static void f() throws MyException {
        System.out.println("Возбуждаем MyException из f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Возбуждаем MyException из g()");
        throw new MyException("Создато в g()");
    }

    public static void makeShit() throws GovnoCodeException {
        System.out.println("Возбуждаем GovnoException из makeShit");
        throw new GovnoCodeException("Ибо нефиг говнокодить");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            makeShit();
        } catch (GovnoCodeException e) {
            e.printStackTrace(System.out);
        }
    }


}
