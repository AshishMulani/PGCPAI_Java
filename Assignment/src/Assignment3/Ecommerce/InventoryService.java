package Assignment3.Ecommerce;

import java.util.*;

public class InventoryService {

    private Map<String, Product> inventory = new HashMap<>();

    public void loadInventory() {
        inventory.put("Laptop", new Product("Laptop", 50000, 5));
        inventory.put("Phone", new Product("Phone", 20000, 10));
        inventory.put("Headphones", new Product("Headphones", 2000, 20));
    }

    public Map<String, Product> getInventory() {
        return inventory;
    }

    public Product getProduct(String name) {
        return inventory.get(name);
    }
}
