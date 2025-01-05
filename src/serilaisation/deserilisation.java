package serilaisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class deserilisation {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ob.txt");
            ObjectInputStream os = new ObjectInputStream(fis);
            while(true) {
                try {
                    student stu = (student) os.readObject();
                    System.out.println(stu);
                } catch (Exception e) {
                    break;
                }
            }


        }
        catch (FileNotFoundException fx) {
            fx.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
