package Problems.Chapter21_ConcurrentExecution.c_ClassThread;

import Problems.Chapter21_ConcurrentExecution.b_CoreOfMultiThreadsPrograms.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SashaKhyzhun on 9/12/17.
 */
public class CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }

}
