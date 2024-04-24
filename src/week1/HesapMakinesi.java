package week1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner sınıfını kullan.
        Scanner x = new Scanner(System.in);

        // Değişkenleri oluştur.
        int sayi1 , sayi2 , araclar;

        // Kullanıcıdan sayi1 değerini al.
        System.out.print("1. Sayıyı Giriniz : ");
        sayi1 = x.nextInt();

        // Kullanıcıya hangi işlemi yapmak istediğini sor.
        System.out.print("Toplama = 1 , Çıkarma = 2 , Bölme = 3 , Çarpma = 4: ");
        araclar = x.nextInt();

        // Kullanıcıdan sayi2 değerini al.
        System.out.print("2. Sayıyı Giriniz : ");
        sayi2 = x.nextInt();

        // Kullanıcının seçtiği işleme göre hesaplamayı yap ve sonucu yazdır.
        switch (araclar){
            case 1 : System.out.print("Yaptığınız İşlem : " + sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
                break;
            case 2 : System.out.print("Yaptığınız İşlem : " + sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
                break;
            case 3 : System.out.print("Yaptığınız İşlem : " + sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
                break;
            case 4 : System.out.print("Yaptığınız İşlem : " + sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
        }
    }
}
