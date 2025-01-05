package ts;

import java.util.*;
import java.util.stream.Collectors;

public class ga {
    public static void main(String [] args)
    {

        String v[]={"ramasdfa", "Shyamb" , "radc", "aaane", "jjsd"};
        String no[]={"2","3","7","9","0","45"};
        int in[]={1,2,3,4,5,67,9};

        List<String> s= Arrays.stream(no).toList();
        double a=Arrays.stream(in).average().getAsDouble();
        System.out.println(a);

        double ans=Arrays.stream(no).mapToInt(Integer::valueOf).average().getAsDouble();
        System.out.println(ans);
        List<Integer> rs1= Arrays.stream(no).toList().stream().map(x->Integer.valueOf(x)).sorted().collect(Collectors.toList());
        System.out.println(rs1);



        String h=Arrays.stream(in).mapToObj(String:: valueOf).collect(Collectors.joining());
        System.out.println(h);


//        List<String> ans= Arrays.stream(v).toList();
//        List<String> result=ans.stream()
//                .sorted(Comparator.comparing(x->x.charAt(x.length()-1)))
//                .collect(Collectors.toList());
//
//        //List<Integer> ans1=result.stream().sorted().collect(Collectors.toList());
        //System.out.println(result);

    }
}



//String a[]={“32”, “8” , “2”, “77”, “9”}; sort given string  by using java8