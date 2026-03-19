package Day2.accespec3;
import Day2.accespec1.Employee;

public class ModifiedEmployee extends Employee {
    public ModifiedEmployee(String name, int salary, float insentive){
        super(name,salary);
        this.setInsentive(insentive);
    }

}
