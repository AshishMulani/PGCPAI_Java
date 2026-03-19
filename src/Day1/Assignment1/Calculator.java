package Day1.Assignment1;
import java.util.*;
import java.util.Scanner;


public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    public double mult(double num1, double num2) {
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can't divide by zero");
        }

        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();

        double num1, num2;
        int choice;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Enter choice: ");
        System.out.println("Enter 1 for Addition: ");
        System.out.println("Enter 2 for Substraction: ");
        System.out.println("Enter 3 for Multiplication: ");
        System.out.println("Enter 4 for Division: ");

        choice = scanner.nextInt();

        switch(choice){

            case 1:
                System.out.println("Addition is: "+ calc.add(num1,num2));
            break;

             case 2:
                System.out.println("Subtraction is: "+ calc.sub(num1,num2));
             break;

             case 3:
                System.out.println("Multiplication is: "+ calc.mult(num1,num2));
              break;

             case 4:
                System.out.println("Division is: "+ calc.div(num1,num2));
              break;
        }

        scanner.close();

    }

}

