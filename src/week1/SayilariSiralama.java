package week1;

import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için bir Scanner nesnesi oluşturuyoruz.
        Scanner x = new Scanner(System.in);

        //Değişkenleri tanımla.
        int sayi1 , sayi2 ,sayi3 ;

        // Kullanıcıdan sırasıyla üç sayı al.
        System.out.print("a Sayıyı Giriniz : ");
        sayi1 = x.nextInt();
        System.out.print("b Sayıyı Giriniz : ");
        sayi2 = x.nextInt();
        System.out.print("c Sayıyı Giriniz : ");
        sayi3 = x.nextInt();

        // Girilen sayıları küçükten büyüğe sırala
        if(sayi1 > sayi2 && sayi2 > sayi3){
            System.out.print("c < b < a");
        } else if (sayi2 > sayi3 && sayi3>sayi1) {
            System.out.print("a < c < b");
        } else if (sayi3 > sayi1 && sayi1>sayi2) {
            System.out.print("b < a < c");
        } else if (sayi3 > sayi2 && sayi2>sayi1) {
            System.out.print("a < b < c");
        } else if (sayi2 > sayi1 && sayi1>sayi3) {
            System.out.print("c < a < b");
        } else if (sayi1 > sayi3 && sayi3>sayi2) {
            System.out.print("b < c < a");
        }
    }
}
