package factory;

public class instance  {
    void foo(int x)
    {
        System.out.println(x%10);
        if(x%10!=0)
        {
            foo(x/10);
        }
        System.out.println(x);
    }


    public static void main(String[] args) {
        fct f=new fct();
       // instance s=new instance();
//
       phone ph=f.get("norm");
        ph.call();
        }
    }

