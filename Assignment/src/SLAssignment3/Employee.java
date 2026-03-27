package SLAssignment3;

public class Employee {

    private String name;
    private int salary;

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println(name + " earns " + salary);
    }
}
