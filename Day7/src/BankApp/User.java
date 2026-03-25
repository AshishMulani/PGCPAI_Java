package BankApp;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String username;
    private String password;
    private double balance;


   public User(String username, String password){
        this.username=username;
        this.password=Encryption.encrypt(password);
        //this.balance=balance;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "User{" + "username='" + username + '\'' + ", balance=" + balance + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

}
