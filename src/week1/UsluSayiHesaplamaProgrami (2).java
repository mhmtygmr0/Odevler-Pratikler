package week1;

import java.util.Scanner;

public class UsluSayiHesaplamaProgrami {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanicidan sayi degerinin al
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        int sayi = x.nextInt();
        // Kullanicidan üssü al
        System.out.print("Üssü giriniz : ");
        int us = x.nextInt();

        // üssü hesaplamak icin deger olustur
        int cevap = 1;

        // üs negatif veya pozitif olarak kontrol et
        if(us > 0) {

            // üssü hesaplamak için dögü olustur
            for (int i = 1; i <= us; i++) {
                cevap *= sayi;
            }
            // Sonucu ekrana yazdır
            System.out.print("Cevap = " + cevap);

        }
        else{
            // üs negatifse hata mesajı ver
            System.out.print("Üssün negatif olamaz.");
        }
    }
}