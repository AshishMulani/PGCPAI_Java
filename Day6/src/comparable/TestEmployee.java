package comparable;

import java.util.*;
//java.util.List<T> list     //

public class TestEmployee {
    public static void main(String[] args) {

//        Set<Employee> employeeset = new HashSet<>();
//
//        employeeset.add(new Employee(3,"a"));
//        employeeset.add(new Employee(1,"b"));
//        employeeset.add(new Employee(2,"c"));
//        System.out.println(employeeset);


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(3,"b"));
        employeeList.add(new Employee(1,"a"));
        employeeList.add(new Employee(4,"d"));
        employeeList.add(new Employee(2,"c"));

        System.out.println(employeeList);

        System.out.println("After sorting");
        Collections.sort(employeeList);
        System.out.println(employeeList);


    }
}
