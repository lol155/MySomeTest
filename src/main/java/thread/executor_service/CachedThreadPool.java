package thread.executor_service;

import thread.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**创建于所需数量相同的线程
 * Created by admin on 2016/9/17.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();//防止新任务被提交给这个Executor
    }
}
