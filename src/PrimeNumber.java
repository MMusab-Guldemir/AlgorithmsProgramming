import java.net.InterfaceAddress;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.smartcardio.TerminalFactory;
import javax.sound.sampled.SourceDataLine;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                System.out.print("Enter input n: ");
                n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Error: Please enter a positive integer greater than 0.");
                    System.out.println();
                } else {
                    break;
                }
            } catch (InputMismatchException e ){
                System.out.println("Error: Invalid input! Please enter an integer.");
                System.out.println();
                scanner.next();
            }
        }
        scanner.close();
        System.out.println("First " + n + "prime numbers: ");
        printFirstPrimes(n);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printFirstPrimes(int n) {
        int count = 0;
        int number = 2;


        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number);
                count++;

                if (count < n) {
                    System.out.print(" ");
                }
            }

            number++;
        }
        System.out.println();

    }
}