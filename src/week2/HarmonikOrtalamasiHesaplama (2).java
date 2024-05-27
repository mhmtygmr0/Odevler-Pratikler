package week2;

import java.util.Scanner;

public class HarmonikOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // Kullanıcıdan dizinin eleman sayısını al
        System.out.print("Dizinin eleman sayısını girin: ");
        int n = x.nextInt();

        // Girilen eleman sayısına göre bir double dizisi oluştur
        double[] dizi = new double[n];

        // Kullanıcıdan dizinin elemanlarını al
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". elemanı girin: ");
            dizi[i] = x.nextDouble();
        }

        // Harmonik toplamı hesapla
        double harmonikToplam = 0;
        for (int i = 0; i < n; i++) {
            harmonikToplam += (1 / dizi[i]);
        }

        // Harmonik ortalama hesapla
        double harmonikOrtalama = n / harmonikToplam;

        // Harmonik ortalamayı ekrana yazdır
        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }
}