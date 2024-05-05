package week2;

import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariniSiralama {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu girmesi isteniyor.
        System.out.print("Dizinin Boyutu n : ");
        int n = x.nextInt();

        // Kullanıcıya, dizinin elemanlarını girmesi için bir mesaj gösteriliyor.
        System.out.println("Dizinin elemanlarını giriniz : ");

        // Girilen boyuta göre bir dizi oluşturuluyor.
        int[] dizi = new int[n];

        // Kullanıcıdan elemanları almak için döngü oluşturuluyor.
        for(int i = 0 ; i < dizi.length ; i++){
            System.out.print(i+1 + ". Elemanı : ");
            int a = x.nextInt();
            dizi[i] = a;
        }

        // Diziyi küçükten büyüğe dogru sirala
        Arrays.sort(dizi);

        // Sıralanmış dizinin elemanları ekrana yazdırılıyor.
        System.out.println("Sıralama : " + Arrays.toString(dizi));
    }
}