package week1;

import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Değişkenleri tanımlıyoruz.
        int km, yas, yolculuktipi;
        double normaltutar, yasindirimi, biletindirimi, indirimlitutar, toplamtutar;

        // Kullanıcıdan mesafeyi km cinsinden alıyoruz.
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = x.nextInt();

        // Kullanıcıdan yaşını alıyoruz.
        System.out.print("Yaşınızı giriniz : ");
        yas = x.nextInt();

        // Kullanıcıdan yolculuk tipini alıyoruz (tek yön veya gidiş dönüş).
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculuktipi = x.nextInt();

        // Normal bilet tutarını hesaplıyoruz (mesafe * 0.10).
        normaltutar = km * 0.10;

        // Girilen verilerin geçerli olup olmadığını kontrol ediyoruz.
        if (yas > 0 && km > 0 && (yolculuktipi == 2 || yolculuktipi == 1)) {

            // Yaşa göre indirim hesaplaması yapıyoruz.
            if (yas < 12) {
                yasindirimi = normaltutar * 0.50;
            } else if (yas >= 65) {
                yasindirimi = normaltutar * 0.30;
            } else if (yas <= 24) {
                yasindirimi = normaltutar * 0.10;
            } else {
                yasindirimi = 0;
            }

            // İndirimli tutarı hesaplıyoruz.
            indirimlitutar = normaltutar - yasindirimi;

            // Yolculuk tipine göre bilet indirimi hesaplanıyor.
            if (yolculuktipi == 2) {
                biletindirimi = indirimlitutar * 0.20;
                toplamtutar = (indirimlitutar - biletindirimi) * 2;
            } else {
                // Tek yönlü ise toplam tutarı direkt olarak indirimli tutar olarak belirliyoruz.
                toplamtutar = normaltutar - yasindirimi;
            }

            // Kullanıcıya toplam tutarı gösteriyoruz.
            System.out.print("Toplam Tutar = " + toplamtutar);

        }
        else {
            // Eğer kullanıcı geçersiz veri girerse hata mesajı gösteriyoruz.
            System.out.print("Hatalı Veri Girdiniz !");

        }
    }
}
