package Problems.Chapter21_ConcurrentExecution.b_CoreOfMultiThreadsPrograms;

/**
 * @author
 * SashaKhyzhun on 9/12/17.
 * Page 894.
 */
public class MainTread {
    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
    }
}
