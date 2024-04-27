package week1;

import java.util.Scanner;

public class SayininBasamaklariToplamiHesaplayanprogram {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan bir sayı al
        System.out.print("Sayı Giriniz : ");
        int sayi = x.nextInt();

        // Degisken olustur
        int  toplam = 0;

        // Sayıyı 10'a bölerek basamakları tek tek alacağımız bir döngü başlat
        while (sayi != 0) {
            int basamak = sayi % 10; // Son basamağı al
            toplam += basamak; // Toplama ekle
            sayi /= 10; // Son basamağı kaldır
        }

        // Basamakların toplamını yazdır
        System.out.print("Basamaklarının Toplamı = " + toplam);
    }
}