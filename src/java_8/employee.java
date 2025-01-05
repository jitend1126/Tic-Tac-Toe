package java_8;

import java.util.Comparator;

public class employee implements Comparator<employee> {
    public String name;
    public int depId;
    public int id;

    public employee(String name, int id, int depId) {
        this.name = name;
        this.id = id;
        this.depId = depId;
    }

    public employee() {

    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
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

    @Override
    public String toString() {
        return "employee{" +
                "depId=" + depId +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public int compare(employee o1, employee o2) {
        return o1.getDepId()- o2.getDepId();
    }
}
