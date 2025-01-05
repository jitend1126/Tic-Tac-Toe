package serilaisation;

import java.io.Serializable;

public class student  implements Serializable,Cloneable {
    public String name;
     transient public  int age;
    public  String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                 name + " ," +
                ", age=" + age +
                ", email='" + email;
    }

    public student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public student clone() {
        try {
          return (student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    public static void main(String [] args)
    {
        student s=new student("Jitendra1",24,"jitend1126@gmail.com");
        student s2=s.clone();
        System.out.println(s);
        System.out.println(s2);
    }
}
