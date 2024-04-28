package week1;

import java.util.Scanner;

public class EbobVeEkokProgrami {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan sayı degerlerini al
        System.out.print("1. Sayıyı Giriniz : ");
        int sayi1 = x.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        int sayi2 = x.nextInt();

        // Küçük olan sayıyı bul
        int sayi = sayi1 > sayi2 ? sayi2 : sayi1;

        int ebob = 0;
        int ekok ;
        int a = 0;

        // EBOB'u hesapla
        while (a <= sayi) {
            a++;
            if (sayi1 % a == 0 && sayi2 % a == 0) {
                ebob = a;
            }
        }

        // EKOK'u hesapla
        ekok = (sayi1 * sayi2 ) / ebob;


        // Sonuçlari ekrana yazdır
        System.out.println("EBOB (" + sayi1 + "," + sayi2 + ") = "  + ebob);
        System.out.println("EKOK (" + sayi1 + "," + sayi2 + ") = "  + ekok);

    }
}