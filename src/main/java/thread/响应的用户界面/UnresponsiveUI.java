package thread.响应的用户界面;

import java.io.IOException;

/**
 * Created by admin on 2016/9/23.
 */
public class UnresponsiveUI {
    private volatile double d = 1;

    public UnresponsiveUI() throws IOException {
        while (d > 0) {
            d = d + (Math.PI + Math.E) / d;
        }
        System.in.read();
    }
}
