package week1;

// Kullanicidan giris almak icin Scanner sinifini projeye dahil etme.
import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {

        //Scanner sinifimizi oluşturup ve x adında nesne tanimladim.
        Scanner x = new Scanner(System.in);

        //Degiskenlerimizi oluşturalim.
        double kdvTutari,kdvsizFiyat,kdvliFiyat,kdvOrani;

        // Kullanicidan degerleri al.
        System.out.print("Ücret Tutarını Giriniz : ");
        kdvsizFiyat = x.nextDouble();

        // KDV oranı belirleyelim.
        kdvOrani = (kdvsizFiyat <= 1000) ? 0.18 : 0.08;

        // KDV'siz fiyat hesaplama ve yazdirma.
        System.out.println("KDV'siz Fiyat : " + kdvsizFiyat);

        // KDV'li fiyat hesaplama ve yazdirma.
        kdvliFiyat = (kdvsizFiyat * kdvOrani) + kdvsizFiyat;
        System.out.println("KDV'li Fiyat  = " + kdvliFiyat + " TL");

        // KDV tutari hesaplama ve yazdirma.
        kdvTutari = kdvliFiyat - kdvsizFiyat;
        System.out.println("KDV Tutarı  = " + kdvTutari + " TL");

        // KDV yuzdesi hesaplama.
        String kdvyuzdesi = (kdvsizFiyat <= 1000) ? "%18" : "%8";
        System.out.print("KDV(%) : " + kdvyuzdesi);


    }
}
