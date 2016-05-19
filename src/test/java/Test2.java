import org.junit.Test;
import test2_2个线程从10每次减1.TicketSeller;

/**
 * Created by admin on 2016/5/19.
 */
public class Test2 {
    @Test
    public void test(){
        try {
            TicketSeller ticketSeller = new TicketSeller(1000);
            Thread thread1 = new Thread(ticketSeller);
            Thread thread2 = new Thread(ticketSeller);
            thread1.start();
            thread2.start();

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
