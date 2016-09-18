package thread.callable;

import thread.LiftOff;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2016/9/18.
 */
public class SleepingTask extends LiftOff {
    @Override
    public void run() {
        try {
            while (countDown -- > 0) {
                System.out.printf(status());
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            service.execute(new SleepingTask());
        }
        service.shutdown();

    }
}
