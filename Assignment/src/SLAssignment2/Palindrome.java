package SLAssignment2;

public class Palindrome {

        public boolean NumPalindrome(int num) {
            int original = num;
            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }

            return original == reverse;
        }

        public boolean StringPalindrome(String str) {
            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

            return str.equalsIgnoreCase(reversed);
        }
    }

