package week1;

import java.util.Scanner;

public class AritmetikIslemlerVeIslemOnceligi {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Degiskenleri oluştur.
        int sayi1 , sayi2 , sayi3 , islemler;

        // Kullanıcıdan 3 sayı degeri al.
        System.out.print("1. Sayıyı Giriniz : ");
        sayi1 = x.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        sayi2 = x.nextInt();

        System.out.print("3. Sayıyı Giriniz : ");
        sayi3 = x.nextInt();

        // İşlem sırasına göre işlemleri yap ve sonucu hesaplama
        islemler = sayi1 + sayi2 * sayi3 - sayi2;

        // Sonucu ekrana yazdırma
        System.out.print("İşlem Sonucu = " + islemler);
    }
}
