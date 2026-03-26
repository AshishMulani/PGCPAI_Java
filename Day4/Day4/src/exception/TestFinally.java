package exception;

public class TestFinally {

    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by Zero");
        }
        finally {
            System.out.println("Logic");
        }
    }
}
