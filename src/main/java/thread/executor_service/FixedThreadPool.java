package thread.executor_service;

import thread.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 指定线程数量
 * Created by admin on 2016/9/17.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }

}
