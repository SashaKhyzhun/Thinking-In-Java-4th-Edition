package Problems.Chapter21_ConcurrentExecution.c_ClassThread;

import Problems.Chapter21_ConcurrentExecution.b_CoreOfMultiThreadsPrograms.LiftOff;

/**
 * @author SashaKhyzhun on 9/12/17.
 * Page 895.
 * Добавление новых потоков.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
