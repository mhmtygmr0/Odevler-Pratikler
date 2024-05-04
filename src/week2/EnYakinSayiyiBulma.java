package week2;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayiyiBulma {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // Diziyi oluşturuyoruz.
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi : " + Arrays.toString(list));

        // Kullanıcıdan bir sayı değeri al
        System.out.print("Girilen Sayi : ");
        int sayi = x.nextInt();

        // Diziyi kücükten büyüge sırala
        Arrays.sort(list);

        // En küçük ve en büyük sayıları başlangıçta dizinin ilk ve son elemanları olarak atıyoruz.
        int min = list[0];
        int max = list[list.length - 1];
        int a = 0;

        // Dizideki her bir elemanı kontrol ediyoruz.
        for (int i : list) {

            // Eğer eleman girilen sayıdan küçükse,
            if (i < sayi) {

                a = i;  // a değişkenine bu elemanı atıyoruz.

                // Bu eleman en büyük küçük sayı ise, min değişkenini güncelliyoruz.
                if (a > min) {
                    min = a;
                }
            }

            // Eğer eleman girilen sayıdan büyükse,
            if (i > sayi) {

                a = i;  // a değişkenine bu elemanı atıyoruz.

                // Bu eleman en küçük büyük sayı ise, max değişkenini güncelliyoruz.
                if (a < max) {
                    max = a;
                }
            }

        }

        // En yakın küçük sayıyı ve en yakın büyük sayıyı ekrana yazdır
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
}