package Assignment3.Ecommerce;

import java.util.*;

public class CheckoutService {

    public double checkout(Cart cart, InventoryService invService)
            throws PaymentException, InventoryException, ShippingException {

        double total = 0;

        for (String item : cart.getItems().keySet()) {

            Product p = invService.getProduct(item);

            if (p == null) {
                throw new InventoryException("Item not found: " + item);
            }

            int qty = cart.getItems().get(item);

            if (p.quantity < qty) {
                throw new InventoryException("Insufficient stock: " + item);
            }

            total += p.price * qty;
        }

        // Payment rule
        if (total > 100000) {
            throw new PaymentException("Payment failed: amount too high");
        }

        // Shipping rule
        if (cart.getItems().size() > 5) {
            throw new ShippingException("Too many items for shipping");
        }

        // Deduct inventory
        for (String item : cart.getItems().keySet()) {
            Product p = invService.getProduct(item);
            int qty = cart.getItems().get(item);

            p.quantity -= qty;
            StatsService.totalItemsSold += qty;
        }

        return total;
    }
}
