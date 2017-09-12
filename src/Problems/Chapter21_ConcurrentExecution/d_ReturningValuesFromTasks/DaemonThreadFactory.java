package Problems.Chapter21_ConcurrentExecution.d_ReturningValuesFromTasks;

import java.util.concurrent.ThreadFactory;

/**
 * @author SashaKhyzhun on 9/12/17.
 * Page 905.
 */
public class DaemonThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
