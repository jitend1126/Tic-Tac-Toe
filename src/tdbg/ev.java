package tdbg;

public class ev {
    public static void main(String[] args) {
        System.out.println("hello");
        String s="madam";
        StringBuilder p=new StringBuilder(s).reverse();
        System.out.println(p);
        if (s.equals(p))
        {
            System.out.println("PAlindrome");
        }
        else
        {
            System.out.println("No plaindromew");
        }
        
    }
}
