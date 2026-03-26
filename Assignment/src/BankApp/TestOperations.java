package BankApp;

import java.util.Scanner;

public class TestOperations {
    public static void main(String[] args) {
        Encryption e = new Encryption();
        //Encryption check
//        System.out.println(e.encrypt("Ash"));
//        System.out.println(e.decrypt("Dvk"));

        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();
        op.loaddata();

        while(true){

            System.out.println("-----Menu------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice==1){
                System.out.println("Enter Username : ");
                String username = sc.nextLine();

                System.out.println("Enter password : ");
                String password = sc.nextLine();

                op.register(username,password);

            }
            else if(choice==2){
                System.out.println("Enter Username : ");
                String username = sc.nextLine();

                System.out.println("Enter password : ");
                String password = sc.nextLine();

                User currentuser = op.login(username,password);
                op.displayUsers();

            }
            else if (choice==3) {
                op.savedata();
                System.out.println("Exit");
                break;
            }
        }
    }
}
