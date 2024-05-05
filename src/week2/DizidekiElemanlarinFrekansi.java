package week2;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {

        // Dizi tanımlama ve değer atama
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları");

        // Değiskenleri olustur
        int indexSayac = 0;
        int sayac = 0;
        int tekrarKontrol = 0;

        // Diziyi sıralama
        Arrays.sort(dizi);

        // Dizi boyunca döngü
        while(indexSayac != dizi.length){

            // Tekrar eden sayıları kontrol etmek için elemanları dizi boyunca döngüye sokma
            int a = dizi[indexSayac];

            for (int j : dizi) {

                // Eğer eleman tekrar ediyorsa sayacı artırma
                if (j == a) {
                    sayac++;
                }

            }
            // Bir sayının tekrar sayısını sadece bir kez yazdırma
            if(a != tekrarKontrol){
                System.out.println(a + " sayısı " + sayac + " kere tekrar edildi.");
            }

            // Tekrar kontrol değişkenini güncelleme
            tekrarKontrol = a;

            // Sayacı sıfırlama
            sayac = 0;

            // İndeks sayacını artırma
            indexSayac++;
        }

    }
}