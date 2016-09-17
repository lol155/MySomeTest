package thread;

/**
 * Created by admin on 2016/9/16.
 */
public class BasciThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiffOff");
    }
}


