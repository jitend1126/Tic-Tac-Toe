package java_8;

import java.util.Comparator;

public class sim implements Comparator<employee>
{

    @Override
    public int compare(employee o1, employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
