package SLAssignment2;

import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Palindrome pd = new Palindrome();

        System.out.println("1. Check Number Palindrome");
        System.out.println("2. Check String Palindrome");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                if (pd.NumPalindrome(num)) {
                    System.out.println("Number is Palindrome");
                } else {
                    System.out.println("Number is NOT Palindrome");
                }
                break;

            case 2:
                sc.nextLine();
                System.out.print("Enter a string: ");
                String str = sc.nextLine();

                if (pd.StringPalindrome(str)) {
                    System.out.println("String is Palindrome");
                } else {
                    System.out.println("String is NOT Palindrome");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
