package thread.catch_exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by admin on 2016/9/23.
 */
public class CaptureUncaughtException {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool(new HandlerTreadFactory());
        service.execute(new ExceptionThread2());
    }
}
