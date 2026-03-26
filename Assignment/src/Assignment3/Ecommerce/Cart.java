package Assignment3.Ecommerce;

import java.util.*;

public class Cart {
    private Map<String, Integer> items = new HashMap<>();

    public void addItem(String name, int qty) {
        items.put(name, items.getOrDefault(name, 0) + qty);
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void showCart() {
        System.out.println("Cart Items: " + items);
    }

    public void clearCart() {
        items.clear();
    }
}
