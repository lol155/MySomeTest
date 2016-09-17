package thread.executor_service;

import thread.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程数量为1的FixedThreadPool,任务将排队执行,每个任务都会在下一个任务开始之前运行结束,所有的任务将使用相同的线程
 * Created by admin on 2016/9/17.
 */
public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
