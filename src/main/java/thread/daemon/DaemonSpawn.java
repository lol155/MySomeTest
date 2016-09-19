package thread.daemon;

/**
 * Created by admin on 2016/9/19.
 */
public class DaemonSpawn implements Runnable {
    @Override
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}
