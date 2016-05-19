package test2_2个线程从10每次减1;
public class TicketSeller implements Runnable{
    private int count = 0 ;
    public TicketSeller(int i) {
        this.count = i ;
        System.out.println("共有票数"+ this.count +"张！");
    }

    public void run() {
        try {
            while(this.count > 0 ){
                synchronized (this){
                    notifyAll();
                    if(this.count > 0){
                        System.out.println(Thread.currentThread().getId() + "售出一张票！剩余" + --this.count +"张票！");
                        wait();
                    }else{
                        System.out.println("票已售完，对不起！");
                    }
                }
            }
            System.out.println("票已全部售完！");
//        notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
