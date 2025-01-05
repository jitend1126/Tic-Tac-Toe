package serilaisation;

public class CustomThread extends Thread {


    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(currentThread().getName() + " Demon");

        } else {
            System.out.println(currentThread().getName() + "user");
        }
    }

    public static void main(String[] args) {



        CustomThread t1 = new CustomThread();
        t1.setName("Demp");
        t1.setDaemon(true);
        t1.start();
        CustomThread t = new CustomThread();
        t.setName("Us ");
        t.start();

    }
}
