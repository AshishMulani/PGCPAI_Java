package Day2.accespec1;

public class Employee {
    public String name;
    private int salary;
    protected String department;
    public float insentive;

    public Employee(String name, int salary){
        this.name = name;
        this.salary= salary;
    }

    public Employee(String name, int salary,float insentive){
        this.name = name;
        this.salary= salary;
        this.insentive =insentive;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name + " " + this.salary;
    }

    public void setName(String name){
        this.name=name;

    }
    public void setDepartment(String department){
        this.department=department;

    }
    public void setInsentive(float insentive){
        this.insentive=insentive;

    }

}
