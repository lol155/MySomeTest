package thread.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by admin on 2016/9/18.
 */
public class Exercise_6 implements Callable<String> {
    private static int taskCount = 0 ;
    private final int id = taskCount ++ ;
    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(1);
        System.out.printf(String.format("#%d(%d)", id, 5));
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
