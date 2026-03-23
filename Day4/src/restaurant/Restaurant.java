package restaurant;

public class Restaurant {
    float total_bill = 0.0f;

    final float poha = 30.00f;
    final float dosa = 40.00f;
    final float idli = 40.00f;
    final float tea = 12.00f;
    final float coffee = 20.00f;

    public void display() {
        System.out.println("\n===== MENU CARD =====");
        System.out.println("1. POHA\t\t30.00");
        System.out.println("2. DOSA\t\t40.00");
        System.out.println("3. IDLI\t\t40.00");
        System.out.println("4. TEA\t\t12.00");
        System.out.println("5. COFFEE\t20.00");
        System.out.println("6. SHOW TOTAL BILL");
        System.out.println("7. EXIT");
        System.out.println("---------------------");
    }
}
