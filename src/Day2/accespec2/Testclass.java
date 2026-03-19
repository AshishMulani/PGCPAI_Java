package Day2.accespec2;

import Day2.accespec1.Employee;

public class Testclass {

    public static void main(String[] args) {
        Employee employee=new Employee("Ashish",2000);
        Employee employee1=new Employee("Ashish",4000);

        employee.setDepartment("IT");
        employee.setIncentive(500f);

        System.out.println(employee);
        System.out.println(employee1);

    }
}
