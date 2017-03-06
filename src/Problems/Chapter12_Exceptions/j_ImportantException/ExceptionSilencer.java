package Problems.Chapter12_Exceptions.j_ImportantException;

/**
 * Created by SashaKhyzhun on 3/6/17.
 */
public class ExceptionSilencer {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Использование "return" в блоке finally
            // подавляет любое вощбужденное исключение.
            return;
        }

    }
}
