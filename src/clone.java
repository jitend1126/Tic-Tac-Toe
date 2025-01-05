import serilaisation.Test;

class  test implements Cloneable
{
    public   int x;
    public   int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

   // @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
////        test c=new test();
////         test temp= (test) super.clone();
////         c.x=temp.x;
////         c.y=temp.y;
//       // return temp;
//
//    }
}

public class clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        test t= new test();
        t.x=7;
        t.y=6;
        test a=t;
        a.x=10;
        a.y=12;
        System.out.println(t.x+" "+t.y);
        System.out.println(a.x+" "+ a.y);
        System.out.println(a.hashCode()+"-"+t.hashCode());

    }
}
