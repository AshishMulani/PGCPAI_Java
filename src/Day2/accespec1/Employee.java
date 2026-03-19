package Day2.accespec1;

public class Employee {
    public String name;
    private int salary;
    protected String department;
    float insentive;

    public Employee(String name, int salary){
        this.name = name;
        this.salary= salary;
    }

    public Employee(String name, int salary,float insentive){
        this.name = name;
        this.salary= salary;
        this.insentive =insentive;
    }


}
