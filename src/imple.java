import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class imple {
//    @Override
//    public void show() {
//        System.out.println("Hello");
//    }

    public static void main(String[] args) {
     //   func c = (int x) -> System.out.println("Hello I am in functional Interface");
        func c=new func();


        String a[]={"ram","shyama","allo","heelo","rin","accaa"};
        List <Integer> no= new ArrayList<>();
        no.add(2);
        no.add(3);
        no.add(0);
        no.add(0);
        List<Integer> hs=no.stream().distinct().collect(Collectors.toList());//mutable
        Set<Integer> hd=new HashSet<>();
        List<Integer> st=no.stream().filter(x->!hd.add(x)).toList();//immuatble
        System.out.println("After Set Implementation");
        System.out.println(st);
        hs.add(90);
      //  st.add(78);
        System.out.println(st);
        System.out.println(hs);
        List<String> no11=Arrays.stream(a)
                        .sorted((x,b)->x.length()-b.length()).toList();
        System.out.println("sort based on length");
        System.out.println(no11);
        List<String> Size=Arrays.stream(a)
                .sorted((x,y)->x.length()-y.length())
                .toList();
        System.out.println(Size);

        List<Integer> rev = no.stream()
//                .mapToObj(Integer::valueOf)// Create IntStream
               // .mapToObj(x->(Integer)x)    // Convert IntStream to Stream<Integer>
                .sorted((x,y)->y-x)
                .toList();
      //  rev.add(7);
        System.out.println("reverse ordeer");
        System.out.println(rev);
        System.out.println(rev.contains(2));
        int hg=rev.indexOf(0);
        System.out.println(hg);
        System.out.println(rev.indexOf(2));
        for (Integer x: rev)
        {
            System.out.print(x);

        }
        Long  vv=  rev.stream().mapToInt(Integer::valueOf).count();


        float sdf=((float) vv);
        System.out.println(vv+" "+sdf);
        System.out.println(vv);
        Map<Character,Integer> te=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {   String h=a[i];
            te.put((h.charAt(0)),te.getOrDefault(h.charAt(0),0)+1);

        }
        System.out.println(te);
        //System.out.println(Arrays.toString(rev));
//        List<String> no=Arrays.stream(a).toList().stream()
//                .sorted((x,y)->x.charAt(x.length()-1)-y.charAt(y.length()-1))
//                        .toList();
     //   System.out.println(no);
        List<String> s= Arrays.asList(a);
        s.forEach(System.out::println);
        int no1[]={2,3,4,5,6,7};
        List<Integer> n1= Arrays.asList(1,2,3,4,5);
        int ans=n1.stream().mapToInt(e->e).sum();
        System.out.println(ans);
        Map<String, Long> an=Arrays.stream(a)
                .collect(Collectors.groupingBy(x->String.valueOf(x.charAt(0)),Collectors.counting()));
        System.out.println(an);





    }
}
