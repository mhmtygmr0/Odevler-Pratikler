package week1;

import java.util.Scanner;

public class TipDonusumleriCasting {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan tam sayı degerini al
        System.out.print("Bir tam sayı Giriniz : ");
        int tamsayi = x.nextInt();

        // Kullanıcıdan ondalıklı sayı degerini al
        System.out.print("Bir ondalıklı sayı Giriniz : ");
        double ondaliklisayi = x.nextDouble();

        // Tam sayıyı ondalıklıya dönüştür ve sonucu yazdır
        System.out.println("Tam sayıyı ondalıklıya dönüştürme sonucu = " + (double) tamsayi);

        // Ondalıklı sayıyı tam sayıya dönüştür ve sonucu yazdır
        System.out.print("Ondalıklı sayıyı tama dönüştürme sonucu = " + (int) ondaliklisayi);
    }
}