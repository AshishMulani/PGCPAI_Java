package Assignment3;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
        System.out.println("Enter the choice");
        System.out.println("*Menu* \n 1. case 1 \n 2. case 2 \n 3. case 3 \n 4. case 4 ");
        num = sc.nextInt();

//        int choice;

            switch (num){

                case 1:
                    System.out.println("Hi");
                    break;
                case 2:
                    System.out.println("Bye");
                    break;

                case 3:
                    System.out.println("Tata");
                    break;
                case 4:
                    System.out.println("Thank you for Visiting");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }while (num != 4);
        sc.close();

    }
}
