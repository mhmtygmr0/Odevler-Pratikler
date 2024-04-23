package week1;

// Kullanicidan giris almak icin Scanner sinifini projeye dahil etme.
import java.util.Scanner;

public class UcgendeAlanVeHipotenusHesaplama {
    public static void main(String[] args) {

        //Scanner sinifimizi oluşturup ve x adında nesne tanimladim.
        Scanner x = new Scanner(System.in);



        System.out.println("UÇGENDE ALAN HESAPLAMA PROGRAMI");

        // Değişkenleri oluştur.
        int kenar1,kenar2,kenar3;
        double yaricevre,alan;

        //Kullanicidan veri alma.
        System.out.print("1.Kenar Uzunluğunu Giriniz : ");
        kenar1 = x.nextInt();

        System.out.print("2.Kenar Uzunluğunu Giriniz : ");
        kenar2 = x.nextInt();

        System.out.print("3.Kenar Uzunluğunu Giriniz : ");
        kenar3 = x.nextInt();

        //Uçgenin Alanini Formulunu Uygulayalim ve ucgenin alanini yazdiralim.
        yaricevre = (kenar1+kenar2+kenar3)/2.0;
        alan = Math.sqrt(yaricevre*(yaricevre-kenar1)*(yaricevre-kenar2)*(yaricevre-kenar3));
        System.out.println("Üçgenin Alanı = " + alan + "\n");




        System.out.println("DIK UÇGENDE HIPOTENUS BULAN PROGRAM");

        // Değişkenleri oluştur.
        int k1,k2;
        double k3;

        //Kullanicidan veri alma.
        System.out.print("1.Kenar Uzunluğunu Giriniz : ");
        k1 = x.nextInt();

        System.out.print("2.Kenar Uzunluğunu Giriniz : ");
        k2 = x.nextInt();

        //Kenar3 un hipotenusu bulalim.
        k3 = Math.sqrt((k1*k1)+(k2*k2));
        System.out.print("Hipotenüs = " + k3);
    }
}
