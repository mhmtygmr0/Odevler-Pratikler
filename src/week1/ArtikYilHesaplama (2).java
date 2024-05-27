package week1;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Degisken olustur
        int yil;

        // Kullanıcıdan yıl bilgisini al
        System.out.print("Yıl Giriniz : ");
        yil = x.nextInt();

        // Artık yıl hesapla ve yazdır
        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)){
            System.out.print(yil + " bir artık yıldır !");
        }
        else{
            System.out.print(yil + " bir artık yıl değildir !");
        }
    }
}
