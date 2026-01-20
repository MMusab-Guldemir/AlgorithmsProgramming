import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class InteractiveMathQuizDevelopProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String devam;

        do {
            int sayi1 = random.nextInt(10) + 1; // 1-10 arası
            int sayi2 = random.nextInt(10) + 1;

            Islem(sayi1, sayi2);

            System.out.print("\nDevam etmek istiyor musunuz? (evet/hayır): ");
            devam = scanner.next();
            System.out.println();

        } while (devam.equalsIgnoreCase("evet"));

        System.out.println("Quiz bitti. Görüşmek üzere!");
        scanner.close();
    }

    public static void Islem(int deger1, int deger2) { 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int operation = random.nextInt(3); // 0, 1 veya 2
        int cevap = 0;
        char islemSembol = ' ';

        // İşlem türünü belirle ve doğru cevabı hesapla
        switch (operation) {
            case 0: // Toplama
                cevap = deger1 + deger2;
                islemSembol = '+';
                break;
            case 1: // Çıkarma
                cevap = deger1 - deger2;
                islemSembol = '-';
                break;
            case 2: // Çarpma
                cevap = deger1 * deger2;
                islemSembol = '*';
                break;
        }

        // Soruyu sor
        System.out.print("İşleminiz: " + deger1 + " " + islemSembol + " " + deger2 + " = ");
        int kullaniciCevap = scanner.nextInt();

        // Cevabı kontrol et
        if (kullaniciCevap == cevap) {
            System.out.println("Tebrikler! Doğru cevap!");
            
            if (kullaniciCevap == 40) {
                System.out.println("Ve Milliyetçi Hareket Partisi'nin 40. Yılı Kutlu olsun!!!");
            }
        } else {
            System.out.println("Yanlış! Doğru cevap: " + cevap);
        }
    }
}

    // public static OtherVersion() {
    // Random random = new Random();

    //     int sayi1 = random.nextInt(1, 11);
    //     int sayi2 = random.nextInt(1, 11);

    //     int Islemler = Islem(sayi1, sayi2);
    // }

    // public static int Islem(int deger1, int deger2) { 
    //     Scanner scanner = new Scanner(System.in);
    //     Random random = new Random();
    //     int operation = random.nextInt(1, 4);

        
    //     if (operation == 1) {
    //         System.out.print("İşleminiz: " + deger1 + " + " + deger2 + ": ");
    //         int Sonuc = scanner.nextInt();
    //         int cevap = deger1 + deger2;

    //         if (Sonuc == deger1 + deger2){
    //             System.out.println("Tebrikler! ");

    //             if (Sonuc == 40) {
    //                 System.out.println("Ve Milliyetçi Hareket Partisi'nin 40. Yılı Kutlu olsun!!! ");
    //             }
    //         } else {
    //             System.out.println("Doğru Cevap: " + cevap);
    //         } 
            
    //     }
    //     if (operation == 2) {
    //         System.out.print("İşleminiz: " + deger1 + " - " + deger2 + ": ");
    //         int Sonuc = scanner.nextInt();
    //         int cevap = deger1 - deger2;
            
    //         if (Sonuc == deger1 - deger2){
    //             System.out.println("Tebrikler! ");

    //             if (Sonuc == 40) {
    //                 System.out.println("Ve Milliyetçi Hareket Partisi'nin 40. Yılı Kutlu olsun!!! ");
    //             }
    //         } else {
    //             System.out.println("Doğru Cevap: " + cevap);
    //         } 
    //     }
    //     if (operation == 3) {
    //         System.out.print("İşleminiz: " + deger1 + " * " + deger2 + ": ");
    //         int Sonuc = scanner.nextInt();
    //         int cevap = deger1 - deger2;

    //         if (Sonuc == deger1 * deger2){
    //             System.out.println("Tebrikler! ");

    //             if (Sonuc == 40) {
    //                 System.out.println("Ve Milliyetçi Hareket Partisi'nin 40. Yılı Kutlu olsun!!! ");
    //             }

    //         } else {
    //             System.out.println("Doğru Cevap: " + cevap);
    //         } 
    //     }
        
    //     return 0;        
// }

