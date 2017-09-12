package Problems.Chapter21_ConcurrentExecution.c_ClassThread;

import Problems.Chapter21_ConcurrentExecution.b_CoreOfMultiThreadsPrograms.LiftOff;

/**
 * @author SashaKhyzhun on 9/12/17.
 * Page 895
 */
public class BasicTreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
