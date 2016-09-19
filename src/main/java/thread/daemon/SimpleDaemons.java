package thread.daemon;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2016/9/19.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.printf(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.printf("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.printf("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
