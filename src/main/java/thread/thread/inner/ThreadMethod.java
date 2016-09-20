package thread.thread.inner;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2016/9/20.
 */
public class ThreadMethod {
    private int countDown = 5;
    private Thread t;
    private String name;

    public ThreadMethod(String name) {
        this.name = name;
    }

    public void runTask() {
        if (t == null) {
            t = new Thread(name){
                @Override
                public void run() {
                    try {
                        while (true) {
                            System.out.printf(this.toString());
                            if (--countDown == 0) {
                                return;
                            }
                            TimeUnit.MILLISECONDS.sleep(10);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("sleep() interrupted");
                    }
                }
            };
            t.start();
        }
    }
}
