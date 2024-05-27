package week1;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        // Scanner nesnesi olusturuluyor.
        Scanner x = new Scanner(System.in);

        // Degiskenler tanimlaniyor.
        double armut , elma , domates , muz , patlican , tutar ;

        // Kullanicidan meyve ve sebze miktarlari aliniyor.
        System.out.print("Armut Kaç Kilo ? : ");
        armut = x.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = x.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = x.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = x.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = x.nextDouble();

        // Fiyatlarla miktarlar carpiliyor ve toplam tutar hesaplaniyor.
        armut *= 2.14;
        elma *= 3.67;
        domates *= 1.11;
        muz *= 0.95;
        patlican *= 5.00;
        tutar = armut + elma + domates + muz + patlican;

        // Toplam tutar ekrana yazdiriliyor.
        System.out.print("Toplam Tutar : " + tutar + " TL");
    }
}
