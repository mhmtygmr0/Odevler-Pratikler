package week2;

import java.util.Scanner;

public class UsluSayiHesaplama {
    // Üs hesaplama metodu
    static int usHesapla(int taban, int us) {

        // Eğer üs 0 ise sonuç 1
        if (us == 0)
            return 1;
        else
            // Üs hesaplanıyor ve recursive olarak fonksiyon kendisini çağır
            return taban * usHesapla(taban, us - 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban değerini al
        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();

        // Kullanıcıdan üs değerini al
        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        // Üs hesaplama metodu çağır ve sonucu ekrana yazdır
        int sonuc = usHesapla(taban, us);
        System.out.println("Sonuç: " + sonuc);

    }
}