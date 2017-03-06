package Problems.Chapter12_Exceptions.b_Logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by SashaKhyzhun on 3/6/17. Page 374
 * На практике чаще приходится перехватывать и регистрировать чужие исклчюения, поэтому
 * в обработчике исключений необходимо сгенерировать соответствующее сообщение:
 */

public class LoggingExceptions2 {

    private static Logger logger = Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }

}
