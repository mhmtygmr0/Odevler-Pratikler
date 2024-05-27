package week1;

import java.util.Scanner;

public class EnBuyukVeEnKucukSayilariBulma {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıya kaç tane sayı gireceğini sor
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int a = x.nextInt();

        // Kullanıcıdan ilk sayıyı al
        System.out.print("1. Sayıyı giriniz: ");
        int sayi = x.nextInt();

        int n = 1;          // Kaçıncı sayı olduğunu takip eden değişken
        int buyuk = sayi;   // En büyük sayıyı tutan değişkeni ilk sayıya eşitliyoruz
        int kucuk = sayi;   // En küçük sayıyı tutan değişkeni ilk sayıya eşitliyoruz


        // Diğer sayıları almak için bir döngü kullanıyoruz
        for(int i = 1; i <= a-1 ; i++){

            n++;
            System.out.print(n + ". Sayıyı giriniz: ");
            sayi = x.nextInt();

            // Girilen sayı, en büyük sayıdan büyükse, en büyük sayıyı güncelliyoruz
            if (sayi >= buyuk){
                buyuk = sayi;
            }
            // Girilen sayı, en küçük sayıdan küçükse, en küçük sayıyı güncelliyoruz
            if (sayi < kucuk){
                kucuk = sayi;
            }

        }

        // Sonuçlar ekrana yazdır
        System.out.println("En büyük sayı : " + buyuk);
        System.out.println("En küçük sayı : " + kucuk);

    }
}