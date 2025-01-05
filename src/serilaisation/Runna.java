package serilaisation;

import java.util.concurrent.ThreadLocalRandom;

class Test1 implements  Runnable
{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Runna {
    public static void main(String[] args) {
        //Runna r=new Runna();
        Test1 t1=new Test1();

        Thread t=new Thread(t1);
        t.setName("Runnable");
        t.start();




    }
}
