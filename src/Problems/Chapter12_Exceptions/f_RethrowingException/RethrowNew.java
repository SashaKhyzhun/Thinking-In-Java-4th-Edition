package Problems.Chapter12_Exceptions.f_RethrowingException;

/**
 * Created by SashaKhyzhun on 3/6/17. Page 381.
 * Так же возможно повторно возбудить исключение, отличающееся от изначально перехваченного.
 * Если вы это делаете, получается такой же эффейт, как и при использовании метода
 * fillInStackTrace(), - информация о месте зарождения исключения теряется и остается только
 * то, что относится к новой команде throw:
 */

class OneException extends Exception {
    public OneException(String s) { super(s); }
}
class TwoException extends Exception {
    public TwoException(String s) { super(s); }
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("Created exception in f()");
        throw new OneException("from f()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (OneException e) {
            System.out.println("Перехвачено во внутреннем блоке try, e.printStackTrace()");
            e.printStackTrace(System.out);
            try {
                throw new TwoException("from inside of the block 'try'");
            } catch (TwoException e1) {
                System.out.println("Перехвачено во внутреннем блоке try, e.printStackTrace()");
                e1.printStackTrace(System.out);
            }
        }
    }
}
