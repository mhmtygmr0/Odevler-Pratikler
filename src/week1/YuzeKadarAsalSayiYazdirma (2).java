package week1;

import java.util.Scanner;

public class YuzeKadarAsalSayiYazdirma {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        for(int i = 1; i <= 100 ; i++){

            int asal = 0;

            for (int k = 1; k <= i ; k++){

                if(i % k == 0){
                    asal += k;
                }

                if(i == asal - 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}