package week1;

import java.util.Scanner;

public class DordunKatlariniToplayanProgram {
    public static void main(String[] args) {

        // "DordunKatlariniToplayanProgram" adında bir sınıf tanımlıyoruz.

        Scanner x = new Scanner(System.in);

        // Kullanıcıya bir sayı girmesi isteniyor.
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int sayi = x.nextInt();

        // Toplamı saklamak için bir değişken oluşturuyoruz.
        int toplam = 0;
        if(sayi % 4 == 0) {
            toplam += sayi;
        }

        // Döngünün durumunu kontrol etmek için bir boolean değişkeni tanımlıyoruz.
        boolean durum = false;

        // "durum" değişkeni "false" olduğu sürece döngü devam eder.
        while (!durum){
            // Girilen sayının çift olup olmadığını kontrol ediyoruz.
            if(sayi % 2 == 0){
                System.out.print("Lütfen Bir Sayı Giriniz : ");
                sayi = x.nextInt();

                // Yeni girilen sayının 4'e tam bölünüp bölünmediğini kontrol ediyoruz.
                if(sayi % 4 == 0){
                    toplam += sayi;
                }
            }
             else{
                // Döngüyü sonlandırmak için "durum" değişkenini "true" yapıyoruz.
                durum = true;
            }
        }

        // 4'ün katları olan sayıların toplamını ekrana yazdırıyoruz.
        System.out.print("Girilen sayılardan 4'ün katları olan sayıların toplamı == " + toplam);

    }
}
