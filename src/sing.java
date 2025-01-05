class Singleton
{
    private Singleton()
    {

    }
    public static Singleton instance=null;

    public static Singleton getInstance() {
        if(instance==null)
        {
            return instance=new Singleton();
        }
        return instance;

    }
}

public class sing
{
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());
        Singleton s=Singleton.getInstance();
        System.out.println(s.hashCode());

    }
}
