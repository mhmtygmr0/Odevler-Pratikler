package week1;

import java.util.Scanner;

public class EnBuyukVeEnKucukSayilariBulma {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan sayı degerlerini al
        System.out.print("Sayıyı Giriniz : ");
        int s1 = x.nextInt();
        System.out.print("Sayıyı Giriniz : ");
        int s2 = x.nextInt();
        System.out.print("Sayıyı Giriniz : ");
        int s3 = x.nextInt();
        System.out.print("Sayıyı Giriniz : ");
        int s4 = x.nextInt();
        System.out.print("Sayıyı Giriniz : ");
        int s5 = x.nextInt();
        System.out.print("Sayıyı Giriniz : ");
        int s6 = x.nextInt();

        int buyuk , kucuk;

        buyuk = s1 > s2 ? s1 : s2;
        buyuk = buyuk > s3 ? buyuk : s3;
        buyuk = buyuk > s4 ? buyuk : s4;
        buyuk = buyuk > s5 ? buyuk : s5;
        buyuk = buyuk > s6 ? buyuk : s6;

        kucuk = s1 < s2 ? s1 : s2;
        kucuk = kucuk < s3 ? kucuk : s3;
        kucuk = kucuk < s4 ? kucuk : s4;
        kucuk = kucuk < s5 ? kucuk : s5;
        kucuk = kucuk < s6 ? kucuk : s6;


        System.out.println("En büyük sayı : " + buyuk);
        System.out.println("En küçük sayı : " + kucuk);
    }
}