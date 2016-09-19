package thread.daemon;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2016/9/19.
 */
public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.printf("d.isDaemon() = " + d.isDaemon() + ".");
        TimeUnit.MILLISECONDS.sleep(1);
    }
}
