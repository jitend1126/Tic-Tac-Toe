package comp;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

class movie implements Comparable<movie> {
    private String filmName;
    private int id;
    private String name;



    public movie(String filmName, int id, String name) {
        this.filmName = filmName;
        this.id = id;
        this.name = name;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compareTo(movie o) {
//        return this.getId()-o.getId();
//    }
    @Override
    public String toString() {
        return "movie{" +
                "filmName='" + filmName + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(movie o) {
        return 0;
    }
}


class kite implements Comparable<movie>
{
    @Override
    public int compareTo(movie o) {
        return 0;
    }

//    @Override
//    public int compare(movie o1, movie o2) {
//        String s= o1.getFilmName();
//        String s1= o2.getFilmName();
//        Character c=s.charAt(s.length()-1);
//        Character b=s1.charAt(s1.length()-1);
//        return c.compareTo(b);
//    }


}


public class cmp {

    public static void main(String [] args)
    {

        ArrayList<movie> m1=new ArrayList<movie>();
        m1.add(new movie("n1",5,"strange"));
        m1.add(new movie("n1",5,"strange"));
        m1.add(new movie("ram",0,"djk"));
        m1.add(new movie("4for",1,"jite"));
        System.out.println(m1.get(0)==(m1.get(1)));
        String s=new String("hello");
        String s1=new String("hello");
        System.out.println(s.equals(s1));
       // Collections.sort(m1);
       // m1.sort(new kite());
        for(movie m: m1)
        {
            System.out.println(m);
        }

    }
}

