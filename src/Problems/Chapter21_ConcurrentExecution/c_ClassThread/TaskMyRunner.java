package Problems.Chapter21_ConcurrentExecution.c_ClassThread;

/**
 * @author SashaKhyzhun on 9/12/17.
 */
class TaskMyRunner implements Runnable {

    public TaskMyRunner() {
        System.out.println("TaskMyRunner Constructor...");
    }

    @Override
    public void run() {
        System.out.println("TaskMyRunner.run message");
        Thread.yield();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        TaskMyRunner taskMyRunner = new TaskMyRunner();
        for (int i = 0; i < 3; i++) {
            taskMyRunner.run();
        }
        System.out.println("the end of taskMyRunner");
    }

}
