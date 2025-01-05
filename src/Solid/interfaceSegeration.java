package Solid;

interface Machine
{
    void print();
    void scan();
}

// printer can not scan it violets interface sergation
class printer implements Machine
{


    @Override
    public void print() {
        System.out.println("printer");
    }

    @Override
    public void scan() {
        throw  new UnsupportedOperationException("scaaner is not possible");

    }
}
interface  printe
{
    void prr();
}
interface scanner
{
    void scan();
}
class pr1 implements printe
{

    @Override
    public void prr() {
        System.out.println("printer");
    }
}
class scaanner implements scanner
{

    @Override
    public void scan() {
        System.out.println("scaanner");
    }
}
public class interfaceSegeration {
    public static void main(String[] args) {

    }
}
