package Solid;

import java.awt.*;

class area
{
    double calculatedarea(Object o) {
        if (o instanceof circle) {
            circle c = new circle();
            return c.r * Math.PI * c.r;

        } else if ( o instanceof square) {
            square s=new square();
            return s.side*s.side;

        }
        return 0;
    }
}


// It folleo openClosed principal
interface  iarea
{
    double iarea();

}
// any new instance comes then we have modify the code
class circle implements iarea
{
    int r=10;

    @Override
    public double iarea() {
        return Math.PI*r*r;
    }
}
class  square implements  iarea
{
    int side=9;

    @Override
    public double iarea() {
        return side*side;
    }
}
public class openclosed {
    public static void main(String[] args) {
        area a=new area();
        a.calculatedarea(new circle());

    }
}
