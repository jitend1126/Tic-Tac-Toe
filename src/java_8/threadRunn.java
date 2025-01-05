package java_8;

public class threadRunn {

    public static void main(String[] args) {

        Thread ti=new Thread(()->{
            System.out.println(Thread.currentThread().getName());

        });
        ti.setName("First");
        ti.start();
        Thread t2=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t2.setName("Second");
        t2.start();
    }
}
