package week1;

// Kullanicidan giris almak icin Scanner sinifini projeye dahil etme.
import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {

        //Scanner sinifimizi oluşturup ve x adında nesne tanimladim.
        Scanner x = new Scanner(System.in);

        //Degiskenlerimizi olusturalim.
        double tutar;
        int km , acilisUcreti = 10;

        //Degiskenlere deger atayalim.
        System.out.print("Gidilen Mesafeyi Giriniz (KM) : ");
        km = x.nextInt();

        tutar = (km * 2.20) + acilisUcreti;
        tutar = (tutar<20)? 20 : tutar;

        System.out.print("Ödeyeceğiniz Toplam Tutar = " + tutar + " TL");
    }
}
