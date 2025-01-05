public class print_thread  {
    private  int number=1;
    private  final  int max;
    public print_thread(int max)
    {
        this.max=max;
    }

    public synchronized void sharedResource(int id) throws  InterruptedException
    {
        while (number<=max)
        {

            while(number%2==0&&id==1||number%2==1&&id==0)
            {
                wait();
            }
            if(number>max)
            {
                break;
            }
            System.out.println(Thread.currentThread().getName());
            if(id==0)
            {
                System.out.println("T" + (id+2) + ": " + number);
            }
            else {
                System.out.println("T" + (id) + ": " + number);
            }
                number++;
                notifyAll();

        }

    }

    public static void main(String[] args) {
        print_thread p=new print_thread(1);
        Thread t1=new Thread(()->
        {
            try {
                p.sharedResource(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        });

        Thread t2=new Thread(()->{

            try {
                p.sharedResource(0);

            }catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();

            }
        });
        t1.setName("Odd Number");
        t2.setName("Even Name");
        t1.start();
        t2.start();

    }

}
