package thread.共享受限资源;

/**
 * Created by admin on 2016/9/23.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){
        canceled = true;}

    public boolean isCanceled() {

        return canceled;
    }

}
