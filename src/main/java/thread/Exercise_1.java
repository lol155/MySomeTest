package thread;

/**
 * Created by admin on 2016/9/17.
 */
public class Exercise_1 implements Runnable{
    private static int count = 5 ;
    private int me ;

    public Exercise_1() {
        System.out.println("#" + count + "启动");
        me = count;
    }

    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("#" + me + "我是一只小白兔!");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        for (; count > 0 ; count --) {
            new Thread(new Exercise_1()).start();
        }
        System.out.println("Off!");
    }
}
