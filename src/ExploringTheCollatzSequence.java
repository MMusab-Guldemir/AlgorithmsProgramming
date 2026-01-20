import java.text.BreakIterator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExploringTheCollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        while (true) {
            try {
                System.out.print("Please enter n: ");
                n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Error: Please enter a positive integer");
                    System.out.println();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input! Please enter an integer");
                System.out.println();
                scanner.next();
            }
        }
        scanner.close();
        int Collatz = CollatzArray(n);
        System.out.println(Collatz);

    }   

    public static int CollatzArray(int num) {
        while (num != 1) {

            System.out.print(num);
            if (num == 1) {
                break;
            }
            System.out.print(", ");

            if (num % 2 == 0) {
                num = (num / 2);
            }
            else {
                num = (num * 3) + 1;
            }
        }
        return num;
    }
}
