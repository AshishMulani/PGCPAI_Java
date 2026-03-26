package switchcase;

import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value between 1-2");
        int value = sc.nextInt();

        switch (value){
            case 1:
                System.out.println("Enter value " + value);
                break;
            case 2:
                System.out.println("Enter value " + value);
                break;
            default:
                System.out.println("Enter value out of range...");
        }


    }
}
