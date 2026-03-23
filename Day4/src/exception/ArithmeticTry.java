package exception;


public class ArithmeticTry {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("Arithmetic Error: Cannot divide by zero");
            e.printStackTrace();
        }
    }
}

