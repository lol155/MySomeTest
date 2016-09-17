package thread;

/**
 * Created by admin on 2016/9/16.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff(1);
        launch.run();
    }
}
