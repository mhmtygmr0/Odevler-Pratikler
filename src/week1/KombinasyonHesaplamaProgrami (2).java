package week1;

import java.util.Scanner;

public class KombinasyonHesaplamaProgrami {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıya n değerini al
        System.out.print("n değerini girin: ");
        int n = x.nextByte();
        // Kullanıcıya r değerini al
        System.out.print("r değerini girin: ");
        int r = x.nextByte();

        // Faktöriyel hesaplamak için degiskenler olustur
        long nFaktoriyel = 1 , rFaktoriyel = 1 , nrFaktoriyel = 1;

        // n'in faktöriyelini hesapla
        for(long i = 1 ; i <= n ; i++){
            nFaktoriyel *= i;
        }

        // r'nin faktöriyelini hesapla
        for(long i = 1 ; i <= r ; i++){
            rFaktoriyel *= i;
        }

        // (n - r)'nin faktöriyelini hesapla
        for(long i = 1 ; i <= (n - r) ; i++){
            nrFaktoriyel *= i;
        }

        // Kombinasyon hesapla
        long kombinasyon = nFaktoriyel / (rFaktoriyel * nrFaktoriyel);
        // Sonucu ekrana yazdır
        System.out.print("C(" + n + "," + r + ") = " + kombinasyon);
    }
}