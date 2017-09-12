package Problems.Chapter21_ConcurrentExecution.d_ReturningValuesFromTasks;

import Problems.Chapter21_ConcurrentExecution.b_CoreOfMultiThreadsPrograms.LiftOff;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author SashaKhyzhun on 9/12/17.
 * Page 901.
 */
public class SleepingTask extends LiftOff {

    @Override
    public void run() {
        try {
            while (countDown-- > 0) {
                System.out.println(status());
                // в старом стиле:
                // Thread.sleep(100);
                // В стиле Java SE 5/6
                TimeUnit.MILLISECONDS.sleep(228);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted ><");
        }
    }


    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
