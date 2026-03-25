package BankApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
    public void save(List<User> users){

        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("user.data"));
            oos.writeObject(users);
            oos.close();

            System.out.println("Data saved successfully!");
        }
        catch (Exception e){
            System.out.println("Error saving data");
        }

    }

    public List<User> load(){

        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("user.data"));

            List<User> users= (List<User>)ois.readObject();
            ois.close();

            System.out.println("Data Loaded successfully!");
            return users;
        }
        catch (Exception e){
            System.out.println("No data");
            return new ArrayList<>();
        }
    }
}
