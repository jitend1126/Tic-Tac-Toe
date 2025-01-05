////class SharedPrinter {
////
////    // Shared number to print
////    //private final int max;
////
////}
//
//
//public class AlternateThreadPrinting {
//    static final Object object = new Object();
//    static final Object object1 = new Object();
//
//    public static void main(String[] args) {
//        int maxNumber = 10;
//
//
//        Thread t1 = new Thread(() -> {
//            try {
//                synchronized (object)
//                {
//                    System.out.println("t1 waiting for object1");
//                   Thread.currentThread().wait(100);
//
//
//                    synchronized (object1)
//                    {
//                        System.out.println("t1 waits insede");
//                    }
//                    System.out.println("t1 waits complted");
//                }
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            synchronized (object1)
//            {
//                //Thread.currentThread().wait(10);
//                System.out.println("t waiting for object");
//                synchronized (object)
//                {
//                    System.out.println("t2 waits inside");
//
//                }
//
//                System.out.println("t2 waits complte");
//                wait();
//
//
//            }
//
//
//        });
//
//        t1.start();
//        t2.start();
//    }
//}
