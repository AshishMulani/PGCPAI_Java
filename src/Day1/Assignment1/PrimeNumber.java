package Day1.Assignment1;

//find out the prime number from given input

import java.util.Scanner;

public class PrimeNumber {

    public boolean findPrimeNumber(int input) {
        double squareroot = Math.sqrt(input);

        for (int i = 2; i <= squareroot; i++) {
            if (input % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input ");
        int input = sc.nextInt();

        PrimeNumber primeNumber= new PrimeNumber();
        boolean result=primeNumber.findPrimeNumber(input);

        if(result)
            System.out.println("Prime Number");

        else
            System.out.println("Not a Prime Number");
        }

}
