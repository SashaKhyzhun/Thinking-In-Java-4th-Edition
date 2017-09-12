package Problems.Chapter21_ConcurrentExecution.b_CoreOfMultiThreadsPrograms;

/**
 * @author
 * SashaKhyzhun on 9/12/17.
 * Page 894.
 */
public class LiftOff implements Runnable {

    protected int countDown = 10; // Default
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {}
    public LiftOff(int countDown) { this.countDown = countDown; }

    public String status() {
        return "#" + id + "("
                + ((countDown > 0) ? countDown : "Liftoff!")
                + "),";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }

    }
}
