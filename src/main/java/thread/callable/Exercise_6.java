package thread.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by admin on 2016/9/18.
 */
public class Exercise_6 implements Callable<String> {
    private static int taskCount = 0 ;
    private final int id = taskCount ++ ;
    @Override
    public String call() throws Exception {
        Random random = new Random();
        int randomInt = random.nextInt(10);
        TimeUnit.SECONDS.sleep(randomInt);
        System.out.printf(String.format("#%d(%d)", id, randomInt));
        return null;
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0 ; i < 10 ; i++) {
            results.add(service.submit(new Exercise_6()));
        }
        service.shutdown();
    }
}
