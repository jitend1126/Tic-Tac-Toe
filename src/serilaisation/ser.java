package serilaisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ser {
    public static void main(String[] args) {

        try {
            student s=new student("aman",6,"aman@gmail.com");
            student s1=new student("aman1",361,"aman1@gmail.com");
            FileOutputStream fis = new FileOutputStream("ob.txt");
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            ois.writeObject(s);
            ois.writeObject(s1);
            ois.close();
            fis.close();
            System.out.println("Serilisation is Done ");


        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
