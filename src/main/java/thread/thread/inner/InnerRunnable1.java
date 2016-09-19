package thread.thread.inner;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2016/9/19.
 */
public class InnerRunnable1 {
    private int countDown = 5;
    private Inner inner;

    public InnerRunnable1(String name) {
        inner = new Inner(name);
    }

    private class Inner implements Runnable{
        Thread t;

        @Override
        public String toString() {
            return t.getName() + ": " + countDown;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(this.toString());
                    if (--countDown == 0) {
                        return;
                    }
                    TimeUnit.MILLISECONDS.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("sleep() interrupted");
            }
        }

        public Inner(String name) {
            t = new Thread(this, name);
            t.start();
        }
    }
}
