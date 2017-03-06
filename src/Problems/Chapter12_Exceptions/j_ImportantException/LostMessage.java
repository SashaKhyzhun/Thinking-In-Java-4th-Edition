package Problems.Chapter12_Exceptions.j_ImportantException;

/**
 * Created by SashaKhyzhun on 3/6/17. Page 393.
 * К сожалению, без изъяна в реализации механизма исключений в Java не обошлось.
 * Несмотря на то что исключения сигнализирует о кризисе в программе и никогда не
 * должно игнорироваться, возможна его потеря. Это происходит при использовании
 * finally в конструкции определенного вида:
 */
class VeryImportantException extends Exception {
    public String toString() {
        return "Очень важное исключение";
    }
}
class HoHumException extends Exception {
    public String toString() {
        return "Второстепенное исключение";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f(); // nothing
            } finally {
                lm.dispose(); // 1...
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
