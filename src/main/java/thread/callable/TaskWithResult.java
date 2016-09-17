package thread.callable;

import java.util.concurrent.Callable;

/**
 * Created by admin on 2016/9/17.
 */
public class TaskWithResult implements Callable<String> {
    private int id ;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }

}
