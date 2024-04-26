package week1;

import java.util.Scanner;

public class DordunKatlariniToplayanProgram {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int sayi = x.nextInt();

        int toplam = 0;
        if(sayi % 4 == 0) {
            toplam += sayi;
        }

        boolean durum = false;


        while (!durum){
            if(sayi % 2 == 0){
                System.out.print("Lütfen Bir Sayı Giriniz : ");
                sayi = x.nextInt();

                if(sayi % 4 == 0){
                    toplam += sayi;
                }
            }
             else{
                durum = true;
            }
        }

        System.out.print("Girilen sayılardan 4'ün katları olan sayıların toplamı == " + toplam);

    }
}
