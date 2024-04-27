package week1;

import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan bir sayı degeri al
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int sayi = x.nextInt();

        // Girilen sayıya kadar olan 4'ün kuvvetlerini ekrana yazdır
        System.out.print("Girilen sayıya kadar olan 4'ün kuvvetleri : ");
        for(int i = 1 ; i <= sayi ; i*=4){

            System.out.print(i + "  ");

        }

        // Girilen sayıya kadar olan 5'in kuvvetlerini ekrana yazdır
        System.out.print("\nGirilen sayıya kadar olan 5'in kuvvetleri : ");
        for(int i = 1 ; i <= sayi ; i*=5){

            System.out.print(i + "  ");

        }
    }

}
