package ts;


public class Singletgon {
    public static void main(String[] args) {
        Singletgon1 s=Singletgon1.getInstance();
        Singletgon1 s2=Singletgon1.getInstance();
        System.out.println(s.hashCode()+" "+s2.hashCode());

    }
}

class Singletgon1 {

    private  Singletgon1()
    {

    }
    public  static  Singletgon1 instance=null;

    public static Singletgon1 getInstance() {
        if(instance==null)
        {
            instance= new Singletgon1();

            return instance;
        }
        else {
            return instance;
        }
    }
}