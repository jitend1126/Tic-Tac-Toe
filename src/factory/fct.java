package factory;

public class fct {


    public phone get(String s ) {
        if (s.equals("smart"))
        {
            return new ios();
        } else if (s.equals("normal")) {
            return new android();

        }
        else
        {
            return new windows();
        }
    }
}
