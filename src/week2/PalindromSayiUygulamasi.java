package week2;

import java.util.Scanner;

public class PalindromSayiUygulamasi {

    // Fonksiyon, verilen bir sayının palindrom olup olmadığını kontrol eder.
    static void isPalindrom (int sayi) {

        // Degiskenler olusturup ilk degerlerini atıyoruz.
        int ilkSayi = sayi , yeniSayi = 0, sonBasammak;

        // Sayı 0 a esit olana kadar döngüyü devam ettir
        while (sayi != 0) {
            // Sayının son basamağı alınır ve sonBasammak değişkenine atanır.
            sonBasammak = sayi % 10;
            // Yeni sayıyı 10 la çarpıp sonbasamak degiskeni ile topla
            yeniSayi = (yeniSayi * 10) + sonBasammak;
            // Sayı, son basamağından arındırılarak bir basamak eksiltir.
            sayi /= 10;
        }
        // Eğer ters çevrilmiş sayı, başlangıçtaki sayıya eşitse, palindromdur.
        if(yeniSayi == ilkSayi) {
            System.out.print("Palindrom Sayıdır.");
        }
        // Değilse, palindrom değildir ve ters çevrilmiş sayı ekrana yazdırılır.
        else{
            System.out.print("Palindrom Sayı Değildir!!!");
        }
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesi istenir.
        System.out.print("Sayı Giriniz : ");
        int sayi = x.nextInt();

        // Palindrom metodunu çagır
        isPalindrom(sayi);

    }
}