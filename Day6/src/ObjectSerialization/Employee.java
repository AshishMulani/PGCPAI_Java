package ObjectSerialization;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Serializable {
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode(){
        System.out.println("called HashCode");
        return id;
    }

    @Override
    public boolean equals(Object obj1) {
        System.out.println("Called Equals");
        if (obj1 != null && obj1 instanceof Employee) {
            Employee e = (Employee) obj1;

            if (this.id == e.id) {   //&& this.name.equals(e.name))  it checks name also and if name diff the prints
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name +" "+ this.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
