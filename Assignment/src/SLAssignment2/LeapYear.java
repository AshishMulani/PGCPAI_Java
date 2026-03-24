package SLAssignment2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        System.out.println("Enter the Year :");
        Scanner sc = new Scanner(System.in);
        int num;
        num= sc.nextInt();

        if ((num%4==0 && num%100 !=0)||(num%400==0)){
            System.out.println("This is a Leap Year!");
        }
        else System.out.println("This is not a leap Year");
    sc.close();
    }
}
