package Collection;

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

        employeeList.add(new Employee(3,"a"));
        employeeList.add(new Employee(1,"b"));
        employeeList.add(new Employee(2,"c"));

        System.out.println(employeeList);
        //Collections.sort(employeeList);
        System.out.println("After sorting");
        System.out.println(employeeList);


    }
}
