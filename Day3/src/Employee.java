public class Employee {
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

@Override
public boolean equals(Object obj1){
    if(obj1 != null && obj1 instanceof Employee){
        Employee e = (Employee) obj1;
        if(this.id == e.id && this.name.equals(e.name))
            return true;
    }
    return false;
}
}


