package week1;

import java.util.Scanner;

public class HavaSicakligiEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // Kullanıcıdan alınacak sıcaklık değeri için değişken tanımlama
        int sicaklik;

        // Kullanıcıdan sıcaklık değerini alma
        System.out.print("Sıcaklık Giriniz : ");
        sicaklik = x.nextInt();

        // Sıcaklık aralıklarına göre önerilen etkinlikleri belirleme
        if(sicaklik < 5){
            System.out.print("Kayak Yapabilirsiniz.");
        }
        if(sicaklik >= 5 && sicaklik <= 15){
            System.out.println("Sinemaya Gidebilirsiniz.");
        }
        if(sicaklik >= 15 && sicaklik <= 25){
            System.out.print("Pikniğe Gidebilirsiniz");
        }
        if(sicaklik > 25){
            System.out.print("Yüzmeye Gidebilirsiniz");
        }
    }
}
