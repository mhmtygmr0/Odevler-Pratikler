package week1;

import java.util.Scanner;

public class CinZodyagiUygulamasi {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Degıskenlerı olustur
        int dogumyili , kalan;
        String zodyagidegeri = ""; // Başlangıç değeri atandı

        // Kullanıcıdan doğum yılını alıyoruz
        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumyili = x.nextInt();

        // Çin Zodyağı hesaplaması için doğum yılından kalanı buluyoruz
        kalan = dogumyili % 12;

        // kalan değerine göre zodyak değerini belirliyoruz
        switch (kalan){
            case 0 : zodyagidegeri = "Maymun";
                break;
            case 1 : zodyagidegeri = "Horoz";
                break;
            case 2 : zodyagidegeri = "Köpek";
                break;
            case 3 : zodyagidegeri = "Domuz";
                break;
            case 4 : zodyagidegeri = "Fare";
                break;
            case 5 : zodyagidegeri = "Öküz";
                break;
            case 6 : zodyagidegeri = "Kaplan";
                break;
            case 7 : zodyagidegeri = "Tavşan";
                break;
            case 8 : zodyagidegeri = "Ejderha";
                break;
            case 9 : zodyagidegeri = "Yılan";
                break;
            case 10 : zodyagidegeri = "At";
                break;
            case 11 : zodyagidegeri = "Koyun";
                break;
        }

        // Çin Zodyağı burcunu ekrana yazdırıyoruz
        System.out.print("Çin Zodyağı Burcunuz : " + zodyagidegeri);
    }
}
