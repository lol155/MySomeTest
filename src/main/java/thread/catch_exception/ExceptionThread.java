package thread.catch_exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by admin on 2016/9/23.
 */
public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            ExecutorService service = Executors.newCachedThreadPool();
            service.execute(new ExceptionThread());
        } catch (Exception e) {
            System.out.printf("Exception has been handled!");
        }
    }
}
