package Problems.Chapter12_Exceptions.b_Logging;

import com.oracle.tools.packager.Log;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by SashaKhyzhun on 3/6/17.
 */


class LoggingException extends Exception {

    private static Logger logger = Logger.getLogger("LoggingExceptions");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}



public class LoggingExceptions extends Exception {

    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.print("Перехвачено " + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.print("Перехвачено " + e);
        }


    }

}
