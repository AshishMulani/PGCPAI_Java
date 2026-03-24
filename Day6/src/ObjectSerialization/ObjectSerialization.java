package ObjectSerialization;



import java.io.*;

public class ObjectSerialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        Employee e = new Employee(1,"a");
        FileOutputStream fos = new FileOutputStream("outfile.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(e);

        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream("outfile.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();
        Employee newEmployee = (Employee) o;
        System.out.println(newEmployee);

    }
}
