package week1;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan Fibonacci serisinin eleman sayısını al
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int sayi = x.nextInt();

        // Döngü icin sayac degisleni olustur
        int sayac = 1;  // Döngünün kaç defa döneceğini belirleyen sayaç

        // İlk iki Fibonacci sayısını tanımla
        int ilksayi = 0;
        int ikincisayi= 1;
        int sonraki;

        // İlk iki sayıyı ekrana yazdır
        System.out.print("Fibonacci Serisi: " + ilksayi + " " + ikincisayi + " ");


        // Fibonacci serisini oluşturmak için bir döngü olustur
        while (sayac < sayi){

            sayac++;

            // Sonraki Fibonacci sayısını hesapla
            sonraki = ilksayi + ikincisayi;

            // Sayıların yeni degerlerini güncelle
            ilksayi = ikincisayi;
            ikincisayi = sonraki;

            // Sonraki sayıyı ekrana yazdır
            System.out.print(sonraki + " ");
        }
    }
}