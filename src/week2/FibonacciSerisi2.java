package week2;

import java.util.Scanner;

public class FibonacciSerisi2 {
    static int fibonacci(int sayi){

        if (sayi == 1 || sayi == 2){
            return 1;
        }
        return fibonacci(sayi - 1) + fibonacci(sayi - 2);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = x.nextInt();

        System.out.print(fibonacci(sayi));

    }
}
