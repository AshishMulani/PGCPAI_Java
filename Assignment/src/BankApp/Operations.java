package BankApp;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    private List<User> users = new ArrayList<>();

    /// Register ///
    public void register(String username, String password){
        boolean exists= users.stream().anyMatch(u -> u.getUsername().equals(username) );

        if(exists){
            System.out.println("User already exist!");
        }
        else{
            users.add(new User(username, password));
            System.out.println("User Registered Successfully!");
        }
    }

    /// Login ///
    public User login(String username, String password){

        for(User u : users){
            if(u.getUsername().equals(username)){
                String decrypted = Encryption.decrypt(u.getPassword());
                if(decrypted.equals(password)){
                    System.out.println("Login Successfull!");
                    return u;
                }
                else{
                    System.out.println("Wrong Password");
                    return null;
                }
            }
        }
        System.out.println("User not found");
        return null;
    }
    public void displayUsers(){
        for(User u : users)
            System.out.println(u);
    }

    /// save-load data ///

    Serialization serialize = new Serialization();

    public void loaddata(){
        users = serialize.load();
    }

    public void savedata(){
        serialize.save(users);
    }

}
