package week1;

// Kullanicidan giris almak icin Scanner sinifini projeye dahil etme.
import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {

        //Scanner sinifimizi oluşturup ve x adında nesne tanimladim.
        Scanner x = new Scanner(System.in);

        //Degiskenlerimizi olusturalim.
        double tutar,toplamtutar;
        int mesafe , acilisUcreti = 10;

        //Degiskenlere deger atayalim.
        System.out.print("Gidilen Mesafeyi Giriniz (KM) : ");
        mesafe = x.nextInt();
        tutar = (mesafe * 2.20) + acilisUcreti;
        toplamtutar = (tutar<20)? 20 : tutar;
        System.out.print("Ödeyeceğiniz Toplam Tutar = " + toplamtutar + " TL");
    }
}
