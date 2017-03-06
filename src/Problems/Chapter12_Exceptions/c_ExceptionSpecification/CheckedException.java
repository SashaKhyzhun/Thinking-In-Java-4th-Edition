package Problems.Chapter12_Exceptions.c_ExceptionSpecification;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by SashaKhyzhun on 3/6/17.
 */

class BubbleException extends Exception {

    private static Logger logger = Logger.getLogger("BubbleException");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class CheckedException {

    static void g() throws Exception, IOException, NullPointerException {
        System.out.println("qwerty");
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
