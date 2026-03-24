package ObjectSerialization;

import java.io.*;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayObjectSerialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        ArrayList<Employee> arrayList = new ArrayList<>();

        arrayList.add(new Employee(1,"a"));
        arrayList.add(new Employee(2,"b"));

        FileOutputStream fos = new FileOutputStream("outfile.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(arrayList);

        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream("outfile.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();
        ArrayList<Employee> newEmployee = (ArrayList<Employee>) o;
        System.out.println(newEmployee);
    }
}
