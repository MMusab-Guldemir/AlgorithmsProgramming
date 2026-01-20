import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class InteractiveMathQuizDevelopProgram {
    public static void main(String[] args) {
        Random random = new Random();

        int sayi1 = random.nextInt(1, 11);
        int sayi2 = random.nextInt(1, 11);

        int Islemler = Islem(sayi1, sayi2);
    }

    public static int Islem(int deger1, int deger2) { 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int operation = random.nextInt(1, 4);

        
        if (operation == 1) {
            System.out.print("İşleminiz: " + deger1 + " + " + deger2 + ": ");
            int Sonuc = scanner.nextInt();
            int cevap = deger1 + deger2;

            if (Sonuc == deger1 + deger2){
                System.out.println("Tebrikler! ");

                if (Sonuc == 40) {
                    System.out.println("Ve Milliyetçi Hareket Partisi'nin 40. Yılı Kutlu olsun!!! ");
                }
            } else {
                System.out.println("Doğru Cevap: " + cevap);
            } 
            
        }
        if (operation == 2) {
            System.out.print("İşleminiz: " + deger1 + " - " + deger2 + ": ");
            int Sonuc = scanner.nextInt();
            int cevap = deger1 - deger2;
            
            if (Sonuc == deger1 - deger2){
                System.out.println("Tebrikler! ");

                if (Sonuc == 40) {
                    System.out.println("Ve Milliyetçi Hareket Partisi'nin 40. Yılı Kutlu olsun!!! ");
                }
            } else {
                System.out.println("Doğru Cevap: " + cevap);
            } 
        }
        if (operation == 3) {
            System.out.print("İşleminiz: " + deger1 + " * " + deger2 + ": ");
            int Sonuc = scanner.nextInt();
            int cevap = deger1 - deger2;

            if (Sonuc == deger1 * deger2){
                System.out.println("Tebrikler! ");

                if (Sonuc == 40) {
                    System.out.println("Ve Milliyetçi Hareket Partisi'nin 40. Yılı Kutlu olsun!!! ");
                }

            } else {
                System.out.println("Doğru Cevap: " + cevap);
            } 
        }
        
        return 0;
    }
}
