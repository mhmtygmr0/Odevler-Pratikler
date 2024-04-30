package week2;
import java.util.Scanner;

public class GelismisHesapMakinesi{

    static Scanner x = new Scanner(System.in);

    static void Toplama(){
        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        int adet = x.nextInt();

        int sayi, toplam = 0;

        for(int i = 1 ; i <= adet ; i++){
            System.out.print(i + ". sayı : ");
            sayi = x.nextInt();
            toplam += sayi;
        }

        System.out.println("Sonuç = " + toplam);

    }

    static void Cikarma(){
        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        int adet = x.nextInt();

        int sayi , fark = 0;

        for(int i = 1 ; i <= adet ; i++){
            System.out.print(i + ". sayı : ");
            sayi = x.nextInt();
            if(i == 1){
                fark = sayi;
            }
            else {
                fark -= sayi;
            }
        }

        System.out.println("Sonuç = " + fark);
    }

    static void Carpma(){
        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        int adet = x.nextInt();

        int sayi, carpim = 1;

        for(int i = 1 ; i <= adet ; i++){
            System.out.print(i + ". sayı : ");
            sayi = x.nextInt();
            carpim *= sayi;
        }

        System.out.println("Sonuç = " + carpim);

    }

    static void Bolme(){
        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        int adet = x.nextInt();

        int sayi, sonuc = 1;

        for(int i = 1 ; i <= adet ; i++){
            System.out.print(i + ". sayı : ");
            sayi = x.nextInt();

            if (i == 1) {
                sonuc = sayi;
            } else {
                sonuc /= sayi;
            }
        }

        System.out.println("Sonuç = " + sonuc);
    }

    static void UsluSayi(){
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = x.nextInt();

        System.out.print("Üssü Giriniz : ");
        int us = x.nextInt();

        int sonuc = sayi;

        for(int i = 1 ; i < us ;i++){
            sonuc *= sayi;
        }

        System.out.println("Sonuç = " + sonuc);

    }

    static void Faktoriyel(){
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = x.nextInt();

        int sonuc = 1;

        for(int i = 1 ; i <= sayi ;i++){
            sonuc *= i;
        }

        System.out.println("Sonuç = " + sonuc);

    }

    static void ModAlma(){
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = x.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayi2 = x.nextInt();

        int mod = sayi1 % sayi2;

        System.out.println("Sonuç = " + mod);

    }

    static void Dikdortgen(){
        System.out.print("Uzun Kenarı Giriniz(m) : ");
        int uKenar = x.nextInt();
        System.out.print("Kısa Kenarı Giriniz(m) : ");
        int kKenar = x.nextInt();

        int alan = uKenar * kKenar;
        int cevre = 2 * uKenar + 2 * kKenar;

        System.out.println("Alan = " + alan + " Çevre = " + cevre);

    }

    public static void main(String[] args) {
        int secim;

        do {

            System.out.println("""
                    ==================================
                    1- Toplama İşlemi
                    2- Çıkarma İşlemi
                    3- Çarpma İşlemi
                    4- Bölme işlemi
                    5- Üslü Sayı Hesaplama
                    6- Faktoriyel Hesaplama
                    7- Mod Alma
                    8- Dikdörtgen Alan ve Çevre Hesabı
                    0- Çıkış Yap
                    ==================================""");

            System.out.print("Lütfen Bir İşlem Seçiniz : ");
            secim = x.nextInt();

            switch (secim) {
                case 1:
                    Toplama();
                    break;
                case 2:
                    Cikarma();
                    break;
                case 3:
                    Carpma();
                    break;
                case 4:
                    Bolme();
                    break;
                case 5:
                    UsluSayi();
                    break;
                case 6:
                    Faktoriyel();
                    break;
                case 7:
                    ModAlma();
                    break;
                case 8:
                    Dikdortgen();
                    break;
                case 0:
                    System.out.println("Programdan Çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız, lütfen tekrar deneyin.");
                    break;
            }
        } while (secim != 0);
    }
}