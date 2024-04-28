package week1;

import java.util.Scanner;

public class AsalSayiUygulamasi {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıya sayı al
        System.out.print("Sayı Giriniz : ");
        int sayi = x.nextInt();

        // Degisken olustur
        int asal = 0;

        // Sayının bölenlerini kontrol et ve topla
        for(int i = 1; i <= sayi ; i++){
            if(sayi % i == 0){
                asal += i;
            }
        }

        // Sayının asal olup olmadığı kontrol et ve ekrana yazdır
        if(sayi == asal-1){
            System.out.println(sayi + " bir asal sayıdır.");
        }else{
            System.out.print(sayi + " bir asal sayı değildir.");
        }
    }
}