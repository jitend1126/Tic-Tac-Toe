package java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class impli {
    public static void main(String[] args) {
        List<employee> emp=new ArrayList<>();
        emp.add(new employee("Jitendra",1,1));
        emp.add(new employee("Ram",2,1));
        emp.add(new employee("shyam",3,2));
        emp.add(new employee("Jitendra1",4,1));
        emp.add(new employee("Jitendra5",5,2));
        emp.add(new employee("Jiten",6,2));
        emp.add(new employee("Jitend",7,3));
        emp.add(new employee("Jitendra",8,3));
        emp.add(new employee("Jitendr",9,4));
        employee s=new employee();
        emp.sort(s);
        System.out.println(emp);
        System.out.println("Next Line");

        Map<Integer,List<employee>> ans=emp.stream()
                .collect(Collectors
                        .groupingBy(employee -> employee.getDepId(),Collectors.toList()));
        ans.entrySet().forEach(x-> System.out.println(x));
        System.out.println(ans);
        sim q=new sim();
        emp.sort(q);
        System.out.println("Nectllll");
        System.out.println(emp);

    }
}

