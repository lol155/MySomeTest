package thread.thread.inner;

/**
 * Created by admin on 2016/9/19.
 */
public class InnerThread2 {
    private int countDown = 5;
    private Thread t;

    public InnerThread2(String name) {
        t = new Thread(name) {
            @Override
            public String toString() {
                return getName() + ": " + countDown;
            }

            public void run() {
                try {
                    while (true) {
                        System.out.println(this.toString());
                        if (--countDown == 0) {
                            return;
                        }
                        sleep(10);
                    }
                } catch (InterruptedException e) {
                    System.out.println("sleep() interrupted");
                }
            }
        };
        t.start();
    }
}
