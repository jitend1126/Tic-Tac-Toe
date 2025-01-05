package Solid;

class bird
{
    void fly()
    {
        System.out.println("Bird is flying");
    }
}
// there penguin cannot substiute the parent standard and it break;
class penguin extends bird
{
    @Override
    void fly() {
        throw new UnsupportedOperationException("penguin can not fly");
    }
}
class  sparrow extends bird
{
    @Override
    void fly() {
        System.out.println("sparrow is flying");
    }
}

public class liskov {
    public static void main(String[] args) {
        bird b=new sparrow();
        b.fly();
        bird b1=new bird();
        b1.fly();
        bird b2=new penguin();
        b2.fly();

    }
}
