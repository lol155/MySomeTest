package thread.catch_exception;

import java.util.concurrent.ThreadFactory;

/**
 * Created by admin on 2016/9/23.
 */
public class HandlerTreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this.toString() + " creating new Thread");
        Thread t = new Thread(r);
        System.out.println("Create " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        return t;
    }
}
