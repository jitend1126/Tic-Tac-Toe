import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class group {
    public static void main(String[] args) {
        String s="aanbdbnrhhfnccgfgdhhehgbghfjndnbAB";
        String s1=s.toLowerCase();
        int [] no={2,4,23,56,243,212,76,222,762};

        List<Integer> an= Arrays.stream(no)
                .mapToObj(String::valueOf)
                .filter(z->z.endsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        int mx=Arrays.stream(no).reduce((a,b)->a>b?a:b).getAsInt();
        int  mn=Arrays.stream(no).reduce((a,b)->b>a?a:b).getAsInt();
        System.out.println(mx+" min---"+mn);
        System.out.println(an);
        Map<Character,Integer> mp=new HashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            mp.put(s1.charAt(i), mp.getOrDefault(s1.charAt(i),0)+1);
        }
        HashSet<Integer> h=new HashSet<>();
        for(Map.Entry<Character,Integer> x:mp.entrySet())
        {
            h.add(x.getValue());
            ;
            System.out.println(x.getKey()+" "+x.getValue());
        }
        //System.out.println(h.remove(2));
        System.out.println(mp.containsValue(3));

        System.out.println(mp.containsKey('a'));

        System.out.println("Set");
        for(Integer x:h)
        {
            System.out.println(x);
        }
        System.out.println("Set End");
        System.out.println(mp);

        Map<Character, Long> ans=s.chars().
                map(Character::toLowerCase)
                .mapToObj(c->(char) c).
                collect(Collectors.groupingBy(x->x,Collectors.counting()));
        List<String> sor= Arrays.stream(no)
                        .mapToObj(c->String.valueOf(c))
                                .sorted((a,b)->a.charAt(a.length()-1)-b.charAt(b.length()-1))
                                        .toList();
        System.out.println("Soretd based on last digit");
        System.out.println(sor);

        System.out.println(ans);
        Queue<Integer> qu= new LinkedList<>();
        qu.add(23456);
        qu.add(3);
        System.out.println(qu.peek());

            }





        Stack<Character> st=new Stack<>();
    { st.push('{');

        if(st.peek()=='{')
        {
            System.out.println(true);
            st.pop();
        }  if (st.empty()) {
            System.out.println("empty");

        }
    }
}
