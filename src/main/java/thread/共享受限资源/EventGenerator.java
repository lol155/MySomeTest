package thread.共享受限资源;

/**
 * Created by admin on 2016/9/23.
 */
public class EventGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }


    public static void main(String[] args) {
        EvenChecker.test(new EventGenerator());
    }
}
