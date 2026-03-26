package Assignment3.Ecommerce;

import java.util.*;

public class StatsService {

    public static int totalItemsSold = 0;

    public static void showStats(InventoryService invService) {

        System.out.println("\n STATISTICS");
        System.out.println("Total Items Sold: " + totalItemsSold);

        for (Product p : invService.getInventory().values()) {
            System.out.println(p.name + " -> " + p.quantity);
        }
    }
}
