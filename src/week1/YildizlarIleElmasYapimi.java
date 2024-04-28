package week1;

import java.util.Scanner;

public class YildizlarIleElmasYapimi {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        //KUllanicidan sayi degeri al
        System.out.print("Bir Sayı Giriniz :");
        int n = x.nextInt();

        // Üst kısmı oluşturma
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // Alt kısmı oluşturma
        for (int i = n - 1; i >= 1 ; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}