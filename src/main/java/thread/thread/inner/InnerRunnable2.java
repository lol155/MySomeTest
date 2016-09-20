package thread.thread.inner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2016/9/20.
 */
public class InnerRunnable2 {
    private int countDwon = 5;
    private Thread t;

    public InnerRunnable2(String name) {
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.printf(this.toString());
                        if (--countDwon == 0) {
                            return;
                        }
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                } catch (InterruptedException e) {
                    System.out.printf("sleep() interrupted");
                }
            }

            @Override
            public String toString() {
                return Thread.currentThread().getName() + ":(" + countDwon +");";
            }
        },name);
        t.start();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            new InnerRunnable2("" + i);
        }
    }
}
