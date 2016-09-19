package thread.daemon;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2016/9/19.
 */
public class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            System.out.printf("Start ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        } finally {
            System.out.println("This should always run?");
        }
    }

}
