package week1;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("KULLANICI : mehmet && SIFRE : 0000 OLARAK ALINIZ. ");

        // Kullanıcı adı ve şifreye deger tanımla
        String Kullanici_Adi = "mehmet" ;
        String Kullanici_Sifresi = "0000";

        // Diger degiskenleri olustur
        String kullanici , sifre , cevap , yenisifre;

        // Kullanıcıdan kullanıcı adını al
        System.out.print("Kullanıcı Adınız : ");
        kullanici = x.nextLine();

        // Kullanıcıdan şifreyi al
        System.out.print("Şifreniz : ");
        sifre = x.nextLine();


        if (kullanici.equals(Kullanici_Adi) && sifre.equals(Kullanici_Sifresi)){
            // Kullanıcı adı ve şifre doğruysa giriş başarılı mesajını yazdır
            System.out.print("Giriş Başarılı.");
        }
        else{
            // Kullanıcı adı ve şifre yanlışsa hata mesajını yazdır
            System.out.print("Hatalı Giriş!!! : Kullanıcı Ve Şifre Yanlış");
        }

        // Kullanıcı adı doğru ancak şifre yanlışsa, kullanıcıya şifre sıfırlama seçeneği sun
        if (kullanici.equals(Kullanici_Adi) && !sifre.equals(Kullanici_Sifresi)){
            System.out.println("Hatalı Giriş!!! : Şifre Yanlış");
            System.out.print("Şifreyi Sıfırlamak İstermisiniz? Y/N : ");
            cevap = x.nextLine();

            // Kullanıcı şifre sıfırlamak isterse, yeni şifre oluşturma sürecini başlat
            if (cevap.equals("Y")){
                System.out.print("Yeni Şifrenizi Giriniz : ");
                yenisifre = x.nextLine();

                // Yeni şifre, eski şifreyle aynıysa hata mesajı ver
                if(yenisifre.equals(Kullanici_Sifresi)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                // Yeni şifre oluşturuldu mesajını yazdır
                else{
                    System.out.print("Şifre Oluşturuldu.");
                }
            }
        }
    }
}
