import java.net.InterfaceAddress;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class PrimeNumber {

    public static List<Integer> asalSayilariBul(int baslangic){
        List<Integer> asalSayilar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input n: ");
        int bitis = scanner.nextInt();
        scanner.nextLine();
        

        for (int i = 0; i <= bitis; i++) {
            if (asalMi(i)) {
                asalSayilar.add(i);
            }
        }
        return asalSayilar;
    }

    public static boolean asalMi(int sayi) {
        if (sayi <= 1) return false;
        if (sayi == 2) return true;
        if (sayi % 2 == 0) return false;

        for (int i = 3; i * i <= sayi; i += 2) {
            if (sayi % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(asalSayilariBul(0));
    }


}