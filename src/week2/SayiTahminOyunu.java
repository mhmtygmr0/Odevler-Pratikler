package week2;

import java.util.Arrays;
import java.util.Scanner;


public class SayiTahminOyunu {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Rastgele bir sayı oluşturuyoruz.
        int rastgeleSayi = (int) (Math.random() * 100);

        // Toplam deneme sayısını ve kalan hakkı tutmak için değişkenler tanımlıyoruz.
        int deneme = 0;
        int hak = 5;
        int index = 0;

        // Kullanıcının yaptığı tahminleri saklamak için bir dizi oluşturuyoruz.
        int[] dizi = new int[5];

        // Rastgele seçilen sayıyı ekrana yazdırıyoruz
        System.out.println(rastgeleSayi);

        // Kullanıcının hakları bitene kadar döngüyü çalıştırıyoruz
        while(hak != 0){

            // Kullanıcıdan tahminini alıyoruz.
            System.out.print("Lütfen Tahmininzi Giriniz : ");
            int sayi = x.nextInt();


            // Kullanıcının girdiği sayının 0 ile 99 arasında olup olmadığını kontrol ediyoruz.
            if(sayi > 99 || sayi < 0){

                // İlk hatalı girişte kullanıcıya uyarı veriyoruz ve bir hak düşürmüyoruz.
                if(deneme == 0){

                    deneme++;
                    System.out.println("Lütfen 0 - 100 arasında bir değer giriniz.");
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");

                }
                // Birden fazla hatalı girişte kullanıcıya uyarı veriyoruz ve bir hak düşürüyoruz.
                else {

                    hak--;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan Hak : " + hak);

                }

            }

            else {

                // Kullanıcının girdiği sayı doğruysa tebrik edip döngüyü sonlandırıyoruz.
                if(sayi == rastgeleSayi){

                    System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + sayi);
                    break;

                } else {

                    // Kullanıcının yanlış tahmin ettiği durumda bir hak düşürüyoruz.
                    hak--;
                    System.out.println("Hatalı bir sayı girdiniz !");

                    // Kullanıcıya gizli sayının büyük veya küçük olduğunu söylüyoruz.
                    if(sayi > rastgeleSayi){
                        System.out.println(sayi + " sayısı, gizli sayıdan büyüktür");
                    }else {
                        System.out.println(sayi + " sayısı, gizli sayıdan küçüktür");
                    }

                    // Kullanıcıya kalan hakkını bildiriyoruz.
                    System.out.println("Kalan Hakkınız : " + hak);
                    System.out.println("=========================");

                    // Kullanıcının tahminini diziye ekliyoruz.
                    dizi[index] = sayi;
                    index++;

                }

            }

            // Kullanıcının hakkı kalmadığında oyunu sonlandırıyoruz ve doğru cevabı gösteriyoruz.
            if(hak == 0){
                System.out.println("Kaybettiniz !");
                System.out.println("Tahminleriniz : " + Arrays.toString(dizi));
            }

        }
    }
}