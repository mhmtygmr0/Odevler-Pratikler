package week1;
/*Java döngüler ile 0'dan girilen sayıya kadar
 olan 3 ve 4'e tam bölünen sayıların ortalamasını
 hesaplayan programı yazınız.
 */
import java.util.Scanner;

public class UcVeDordeTamBolunenSayilar {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan sayı al
        System.out.print("Sayi Giriniz : ");
        int sayi = x.nextInt();

        // Degiskenleri olustur
        int toplam = 0 , adet = 0 , ortalama;
        boolean durum = false;

        // Durum değişkeni false olduğu sürece döngü çalışır
        while (!durum){
            // Girilen sayı 12'den büyük veya eşitse
            if(sayi>= 12){

                for(int i = 1 ; i <= sayi ; i++){

                    // hem 3'e hem de 4'e bölünüyormu kontrol et
                    if (i % 3 == 0 && i % 4 == 0){
                        toplam += i;
                        adet++;
                    }

                }
                // Ortalamayı hesapla ve ekrana yazdır
                ortalama = toplam / adet;
                System.out.print("3 ve 4'e Tam Bölünen Sayıların Ortalaması : " + ortalama);
                durum = true;
            }

            else{
                // Girilen sayı 12'den küçükse, kullanıcıdan tekrar sayı iste ve döngüyü yeniden başlat
                System.out.println("Girdiğiniz Sayi 3 ve 4 e tam bölünmüyor!! Tekrar Deneyiniz.  ");
                System.out.print("Sayi Giriniz : ");
                sayi = x.nextInt();
            }
        }
    }
}

