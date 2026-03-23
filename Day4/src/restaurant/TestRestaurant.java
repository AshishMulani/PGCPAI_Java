package restaurant;
import java.util.Scanner;

public class TestRestaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant res = new Restaurant();
        int choice = 0;

        System.out.println("Welcome to the Abhinay Resto!");

        do {
            res.display();
            System.out.print("Enter your choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        res.total_bill += res.poha;
                        System.out.println("Added Poha. Total: " + res.total_bill);
                        break;
                    case 2:
                        res.total_bill += res.dosa;
                        System.out.println("Added Dosa. Total: " + res.total_bill);
                        break;
                    case 3:
                        res.total_bill += res.idli;
                        System.out.println("Added Idli. Total: " + res.total_bill);
                        break;
                    case 4:
                        res.total_bill += res.tea;
                        System.out.println("Added Tea. Total: " + res.total_bill);
                        break;
                    case 5:
                        res.total_bill += res.coffee;
                        System.out.println("Added Coffee. Total: " + res.total_bill);
                        break;
                    case 6:
                        System.out.println("\n== YOUR CURRENT TOTAL IS: Rs. " + res.total_bill);
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");

            }
        } while (choice != 7);

        generateBill(res.total_bill);

    }

    public static void generateBill(double total) {
        System.out.println("== FINAL AMOUNT: Rs. " + total);
    }
}
