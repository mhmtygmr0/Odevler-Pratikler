package week2;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan bir sayı degeri al
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi, 2))
            // Eğer sayı asalsa ekrana yazdır
            System.out.println(sayi + " sayısı ASALDIR !");
        else
            // Eğer sayı asal değilse ekrana yazdır
            System.out.println(sayi + " sayısı ASAL değildir !");
    }

    // asalMi fonksiyonu, bir sayının asal olup olmadığını kontrol eder
    static boolean asalMi(int sayi, int bolen) {

        // Sayı 1'den küçükse asal değil
        if (sayi <= 1)
            return false;

        // Bölenin karesi sayıdan büyükse asal
        if (bolen * bolen > sayi)
            return true;

        // Sayı bölündüğünde kalan sıfırsa asal değil
        if (sayi % bolen == 0)
            return false;

        return asalMi(sayi, bolen + 1);
    }
}
