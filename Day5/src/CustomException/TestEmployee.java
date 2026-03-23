package CustomException;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/// try with resource block
        try (sc) {
            Employee emp = new Employee(sc.next(),sc.nextInt(),sc.next());
        }
        catch (AgeException e){
            System.out.println("Caught an Error: "+e.getMessage());
        }


//        try {
//            Employee emp = new Employee("Ashish", 20, "abc@gmail.com");
//        }
//        catch (AgeException e){
//            System.out.println("Caught an Error: "+e.getMessage());
//        }
    sc.close();
    }
}
