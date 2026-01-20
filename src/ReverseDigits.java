import java.util.InputMismatchException;
import java.util.Scanner;


public class ReverseDigits {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = 0;

            while (true) {
                try {
                    System.out.print("Please input n: ");
                    n = scanner.nextInt();

                    if (n <= 0) {
                        System.out.println("Error: Please enter a positive integer.");
                        System.out.println();
                    } else {
                        break;   
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input! Please enter an integer.");
                    System.out.println();
                    scanner.next();
                }
            }
            scanner.close();

            int reversed = reverseNumber(n);
            System.out.println(reversed);
        }

        public static int reverseNumber(int num) {
            int reversed = 0;

            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;
            }

            return reversed;
        }
}
