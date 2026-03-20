import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num = sc.nextInt();

        for(int i=1; i<num+1; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
