package week1;

import java.util.Scanner;

public class MukemmelSayiUygulamasi {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıya bir sayı girmesi için bir mesaj gösteriyoruz.
        System.out.print("Bir sayı giriniz : ");
        int sayi = x.nextInt();

        // İlk toplam değerini sıfıra ayarlıyoruz.
        int toplam = 0;

        // 1'den başlayarak sayının kendisine kadar olan tüm bölenlerini kontrol ediyoruz.
        for(int i = 1; i < sayi ; i++){
            // Eğer i, sayıya tam bölünüyorsa, i'yi toplam değişkenine ekliyoruz.
            if(sayi % i == 0){
                toplam += i;
            }
        }

        // Toplam, girdiğimiz sayıya eşitse, bu sayı mükemmel bir sayıdır.
        if(toplam == sayi){
            System.out.println(sayi + " Mükemmel sayıdır.");
        }
        // degilse mükemmel sayi değildir.
        else{
            System.out.print(sayi + " Mükemmel sayı değildir.");
        }
    }
}
