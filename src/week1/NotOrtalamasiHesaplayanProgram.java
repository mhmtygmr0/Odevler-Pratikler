package week1;

// Kullanicidan giris almak icin Scanner sinifini projeye dahil etme.
import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {

        //Scanner sinifimizi oluşturup ve x adında degişkenken tanimladim.
        Scanner x = new Scanner(System.in);

        // Değişkenleri oluştur.
        int matematik, fizik, kimya, turkce, tarih, muzik;
        double ortalama;
        String sonuc;

        // Kullanicidan degerleri al.
        System.out.print("Matematik Notunuz : ");
        matematik = x.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = x.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya =  x.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce =  x.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih =  x.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik =  x.nextInt();

        //ortlamayi hesapla ve yazdir.
        ortalama = (matematik + fizik + kimya +turkce + tarih + muzik) / 6.0 ;
        System.out.print( "Ortalamanız : " + ortalama);

        //sonuc hesapla ve yazdir (gecti/kaldi).
        sonuc = (ortalama >= 50.0) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız" ;
        System.out.print( " ===> " + sonuc);

    }
}
