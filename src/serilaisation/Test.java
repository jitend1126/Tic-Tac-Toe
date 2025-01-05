package serilaisation;
public class Test {

    public static void main(String[] args)
    {
        System.out.println("Main thread is- "
                + Thread.currentThread().getName());
        Test t=new Test();


        Thread t1 = new Thread(t.new RunnableImpl());
        t1.start();

    }

    public class RunnableImpl implements Runnable {

        public void run()
        {
            System.out.println(Thread.currentThread().getName()
                    + ", executing run() method!");
        }
    }
}






















//public class Test {
//    public class RunImpl implements Runnable{
//        @Override
//        public void run() {
//            System.out.println(Thread.currentThread().getName());
//        }
//
//    public static void main(String [] args)
//    {
//
//        Thread t=new Thread(new RunImpl());
//        t.start();
//    }
//
//
//}
//
