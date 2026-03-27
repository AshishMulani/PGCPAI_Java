package SLAssignment3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class TestProperties {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("dd.properties");

        Properties properties = new Properties();
        properties.load(fis);

        List<Employee> list = new ArrayList<>();

        String name1 = properties.getProperty("emp1.name");
        int sal1 = Integer.parseInt(properties.getProperty("emp1.salary"));

        String name2 = properties.getProperty("emp2.name");
        int sal2 = Integer.parseInt(properties.getProperty("emp2.salary"));

        list.add(new Employee(name1, sal1));
        list.add(new Employee(name2, sal2));

        System.out.println("Employee List:");
        for (Employee e : list) {
            e.display();
        }
    }
}
