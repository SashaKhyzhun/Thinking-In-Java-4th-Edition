package Problems.Chapter21_ConcurrentExecution.d_ReturningValuesFromTasks;

import java.util.concurrent.Callable;

/**
 * @author SashaKhyzhun on 9/12/17.
 * Page 900. Woo-hoo.
 * Возвращение значений из задач
 */
public class TaskWithResult implements Callable<String> {

    private int id;
    public TaskWithResult(int id) {
        this.id = id;
    }


    @Override
    public String call() throws Exception {
        return "Result of TaskWithResult " + id;
    }
}
