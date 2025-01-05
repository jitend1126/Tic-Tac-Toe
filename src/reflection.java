import java.lang.reflect.Method;
import java.sql.SQLOutput;

class animal
{
    private String name;
    public int age;
    public  int roll_no;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
}

public class reflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c=Class.forName(
                "animal"
        );
        System.out.println(c.getSuperclass());
      //  System.out.println(c.toString());
        animal a=(animal)c.newInstance();
        System.out.println(a);
        Method method[]=c.getDeclaredMethods();

        for(Method m: method)
        {
            System.out.println(m.getName());
        }



    }
}