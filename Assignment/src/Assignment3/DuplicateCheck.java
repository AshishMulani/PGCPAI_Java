package Assignment3;

import java.util.*;


public class DuplicateCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter total count of numbers: ");
        int n = sc.nextInt();

        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number: ");
                int num = sc.nextInt();

                // Check for duplicate
                if (numbers.contains(num)) {
                    throw new DuplicateNumberException("Duplicate number found: " + num);
                }

                numbers.add(num);
            }

            System.out.println("All numbers are unique: " + numbers);

        } catch (DuplicateNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}