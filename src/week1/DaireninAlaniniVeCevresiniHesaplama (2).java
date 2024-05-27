package week1;

// Kullanicidan giris almak icin Scanner sinifini projeye dahil etme.
import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesaplama {
    public static void main(String[] args) {

        //Scanner sinifimizi oluşturup ve x adında nesne tanimladim.
        Scanner x = new Scanner(System.in);

        int yaricap;
        double pi=3.14 , alan , cevre , a ,dairedilimialan;

        // Degiskenlere deger atayalim.
        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        yaricap = x.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = x.nextDouble();

        alan = pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;
        dairedilimialan = (pi * yaricap * yaricap * a) / 360;

        // Sonucu ekrana yazdiralim.
        System.out.println("Dairenin Alanı = " + alan);
        System.out.println("Dairenin Çevresi = " + cevre + " cm");
        System.out.println("Daire diliminin alanı: " + dairedilimialan);
    }
}
