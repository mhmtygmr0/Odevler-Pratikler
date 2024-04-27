package week1;

import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan deger al
        System.out.print("Sayı Giriniz : ");
        int sayi = x.nextInt();

        // Eğer kullanıcı negatif veya sıfır bir sayı girdiyse programı sonlandır
        if (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
            return; // Programı sonlandır
        }

        double toplam = 0;

        // Harmonik sayıları hesapla
        for (double a = 1 ; a <= sayi ; a++){
            toplam += 1 / a;
        }

        // Sonucu ekrana yazdırıyoruz.
        System.out.print("Harmonik Sayı Toplamı = " + toplam);
    }
}
