package week5;

import java.util.Scanner;

public class TryCatchBloguProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir indeks numarası alıyoruz
        System.out.print("Index numarası giriniz : ");
        int index = input.nextInt();

        // Girilen indeks numarasına göre proje metodunu çağırıyoruz ve sonucu yazdırıyoruz.
        System.out.println(proje(index));
    }

    // Belirtilen indeks numarasına göre dizideki elemanı döndüren metot.
    public static String proje(int index) {
        // Bir dizi tanımlıyoruz ve içine bazı elemanlar ekliyoruz.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        try {
            // Girilen indeks numarasındaki elemanı döndürüyoruz.
            return index + ". Indexteki Eleman = " + (array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Eğer girilen indeks geçersiz ise, hata mesajı döndürüyoruz.
            return "Hata: Geçersiz indeks numarası!";
        }
    }
}