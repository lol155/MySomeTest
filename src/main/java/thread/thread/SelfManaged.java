package thread.thread;

/**
 * Created by admin on 2016/9/19.
 */
public class SelfManaged implements Runnable{
    private int countDown = 5;

    private Thread t = new Thread(this);

    public SelfManaged() {
        t.start();
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName() + "(" + countDown + ").";
    }

    @Override
    public void run() {
        while (true) {
            System.out.printf(this.toString());
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SelfManaged();
        }
    }
}
