package thread.catch_exception;

/**
 * Created by admin on 2016/9/23.
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("caught" + e);
    }
}
