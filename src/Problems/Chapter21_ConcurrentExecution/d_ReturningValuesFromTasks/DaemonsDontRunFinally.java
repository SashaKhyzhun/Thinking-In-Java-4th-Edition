package Problems.Chapter21_ConcurrentExecution.d_ReturningValuesFromTasks;

import java.util.concurrent.TimeUnit;

/**
 * @author SashaKhyzhun on 9/12/17.
 * Page 908.
 */
class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        } finally {
            System.out.println("This should always run?!");
        }
    }
}
public class DaemonsDontRunFinally {
    public static void main(String[] args) {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
}
