package week1;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Basamak Sayısı Giriniz : ");
        int basamak = x.nextInt();

        for(int i = basamak ; i >= 1; i--){
            for (int j = 0; j < basamak - i; j++) {
                System.out.print("");
            }
            for (int k = 0 ; k < 2 * i - 1 ; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
