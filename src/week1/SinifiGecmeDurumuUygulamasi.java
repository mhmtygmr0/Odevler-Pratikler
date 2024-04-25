package week1;

import java.util.Scanner;

// Bir öğrencinin matematik, fizik, Türkçe, kimya ve müzik derslerindeki notlarını alarak
// sınıfı geçme durumunu belirleyen bir uygulama.

public class SinifiGecmeDurumuUygulamasi {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        int matematik , fizik , turkce , kimya , muzik;
        double derssayisi = 0  , toplamnot = 0;
        double ortalama;

        // Kullanıcıdan matematik notunu al.
        System.out.print("Matematik Notunuz : ");
        matematik = x.nextInt();

        // Kullanıcıdan fizik notunu al.
        System.out.print("Fizik Notunuz : ");
        fizik = x.nextInt();

        // Kullanıcıdan Türkçe notunu al.
        System.out.print("Türkçe Notunuz : ");
        turkce = x.nextInt();

        // Kullanıcıdan kimya notunu al.
        System.out.print("Kimya Notunuz : ");
        kimya = x.nextInt();

        // Kullanıcıdan müzik notunu al.
        System.out.print("Müzik Notunuz : ");
        muzik = x.nextInt();

        // Her ders için 0 ile 100 arasında bir not girilmişse, ders sayısını ve toplam notu hesapla.
        if(0 <= matematik && matematik <= 100){
            ++derssayisi;
            toplamnot += matematik;
        }
        if (0 <= fizik && fizik <= 100) {
            ++derssayisi;
            toplamnot += fizik;
        }
        if (0 <= turkce && turkce <= 100){
            ++derssayisi;
            toplamnot += turkce;
        }
        if (0 <= kimya && kimya <= 100){
            ++derssayisi;
            toplamnot += kimya;
        }
        if (0 <= muzik && muzik <= 100){
            ++derssayisi;
            toplamnot += muzik;
        }

        // Not ortalamasını hesapla ve ekrana yazdır.
        ortalama = toplamnot / derssayisi;
        System.out.print("Not Ortalamanız : " + ortalama);

        // Not ortalaması 55 veya üstündeyse sınıfı geçildiğini, değilse kaldığını belirt.
        if (ortalama >= 55){
            System.out.print(" Tebrikler , sınıfı geçtiniz !");
        }
        else {
            System.out.print(" Sınıfta Kaldınız");
        }
    }
}
