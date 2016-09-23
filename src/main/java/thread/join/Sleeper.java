package thread.join;

/**
 * Created by admin on 2016/9/23.
 */
public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted." + "isInterrupted():" + isInterrupted());
            return;
        }
        System.out.println(getName() + " has awakened");

    }
}
