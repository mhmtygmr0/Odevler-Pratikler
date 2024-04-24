package week1;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        // Kullanicidan boy ve kilo bilgilerini alarak vucut kitle indeksini hesaplar.

        Scanner x = new Scanner(System.in);

        // Degiskenlerimizi tanimliyoruz.
        double m , kg , vki;

        // Kullanicidan girdigimiz degerleri degiskenlerimize atiyoruz.
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = x.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = x.nextDouble();

        // Vucut kitle indeksi hesaplayip ekrana yazdiriyoruz. Formül: kilo / (boy * boy)
        vki = kg / (m * m);
        System.out.print("Vücut Kitle İndeksiniz : " + vki);
    }
}
