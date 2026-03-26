package Assignment3.Ecommerce;

import java.util.*;

public class TestApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventoryService invService = new InventoryService();
        invService.loadInventory();

        Cart cart = new Cart();
        CheckoutService checkoutService = new CheckoutService();

        while (true) {

            System.out.println("\n1. Add Item\n2. View Cart\n3. Checkout\n4. Stats\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.next();

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    cart.addItem(name, qty);
                    System.out.println("Item added!");
                    break;

                case 2:
                    cart.showCart();
                    break;

                case 3:
                    try {
                        double total = checkoutService.checkout(cart, invService);
                        System.out.println(" Order placed! Total: " + total);
                        cart.clearCart();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    StatsService.showStats(invService);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
