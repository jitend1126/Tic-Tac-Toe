package java_8;

public class thread  extends Thread{
    @Override
    public void run() {
        System.out.println(thread.currentThread().isDaemon());

        System.out.println(thread.currentThread().getName());
    }

    public static void main(String[] args) {

        thread t=new thread();
        thread t1=new thread();
        t.setName("FIrst");
        t.setDaemon(true);
        t1.start();
        t.start();
    }
}
