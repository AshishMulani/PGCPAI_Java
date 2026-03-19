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
                    System.out.println("addition is: " + Calculator.add(num1, num2));
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



//import java.util.Scanner; // Import the Scanner class for user input
//
//public class Calculator {
//
//    // Method to add two numbers
//    public double add(double num1, double num2) {
//        return num1 + num2;
//    }
//
//    // Method to subtract two numbers
//    public double subtract(double num1, double num2) {
//        return num1 - num2;
//    }
//
//    // Method to multiply two numbers
//    public double multiply(double num1, double num2) {
//        return num1 * num2;
//    }
//
//    // Method to divide two numbers, including a check for division by zero
//    public double divide(double num1, double num2) {
//        if (num2 == 0) {
//            System.out.println("Error: Division by zero is not allowed.");
//            return Double.NaN; // Return "Not a Number" to indicate an error
//        }
//        return num1 / num2;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Calculator calc = new Calculator(); // Create an instance of the Calculator class
//        double num1, num2, result = 0;
//        char operator;
//
//        // Get user input
//        System.out.print("Enter first number: ");
//        num1 = scanner.nextDouble();
//        System.out.print("Enter operator (+, -, *, /): ");
//        operator = scanner.next().charAt(0);
//        System.out.print("Enter second number: ");
//        num2 = scanner.nextDouble();
//
//        // Perform operation using the appropriate function via a switch statement
//        switch (operator) {
//            case '+':
//                result = calc.add(num1, num2);
//                break;
//            case '-':
//                result = calc.subtract(num1, num2);
//                break;
//            case '*':
//                result = calc.multiply(num1, num2);
//                break;
//            case '/':
//                result = calc.divide(num1, num2);
//                break;
//            default:
//                System.out.println("Invalid operator. Please choose a valid operation.");
//                scanner.close();
//                return; // Exit if the operator is invalid
//        }
//
//        // Display the result
//        if (!Double.isNaN(result)) {
//            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
//        }
//
//        // Close the scanner
//        scanner.close();
//    }
//}
