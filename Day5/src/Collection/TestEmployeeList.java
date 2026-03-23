package Collection;

import java.util.ArrayList;

public class TestEmployeeList {
    public static void main(String[] args) {

        ArrayList<Employee> arraylist =new ArrayList<>();

        arraylist.add(new Employee(1,"a"));
        arraylist.add(0,new Employee(1,"b"));
        System.out.println(arraylist);

    }
}
