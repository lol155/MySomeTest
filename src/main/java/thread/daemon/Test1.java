package thread.daemon;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2016/9/19.
 */
public class Test1 implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Test1());
//        t.setDaemon(true);
        t.start();
        System.out.println("main end");
    }
}
