package SLAssignment2;

import java.util.Scanner;

public class TestSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Sort st = new Sort(arr);

        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                st.bubbleSort();
                break;

            case 2:
                st.selectionSort();
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Sorted Array: " + st);

        sc.close();
    }
}

