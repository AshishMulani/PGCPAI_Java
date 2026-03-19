package Day1.Assignment1;
import java.util.*;
import java.util.Scanner;


public class Calculator {

        public static double add(double a, double b) {

            return a + b;
        }
        public static double subtract(double a, double b) {

            return a - b;
        }
        public static double multiply(double a, double b) {

            return a * b;
        }
        public static double divide(double a, double b) {

            return a / b;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println(" CALCULATOR APP");
            System.out.println(" ENTER 1 FOR ADDITION");
            System.out.println(" ENTER 2 FOR SUBSTRACTION");
            System.out.println(" ENTER 3 FOR MULTIPLICATION");
            System.out.println(" ENTER 4 FOR DIVISION");

            System.out.print("ENTER YOUR CHOICE  ");
            int choice = sc.nextInt();

            System.out.print("ENTER YOR YOUR NUMBER: ");
            double num1 = sc.nextDouble();

            System.out.print("ENTER YOUR SECOND NUMBER: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("addition is: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("substraction is: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("multiplication is: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("division is: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("you have entered invalid choice");
            }

         sc.close();          /*for closing scanner object*/
        }
    }



