package week2;

import java.util.Scanner;

public class MatrisTranspozu {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int satir = x.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int sutun = x.nextInt();

        System.out.println("Matrisin elemanlarını girin:");


        int[][] matris = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + (i+1) + "][" + (j+1) + "]: ");
                matris[i][j] = x.nextInt();
            }
        }

        int[][] transpoz = new int[sutun][satir];
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

        // Matris ve transpozunu yazdır
        System.out.println("===============");
        System.out.println("Matris:");
        print(matris);
        System.out.println("Transpoze:");
        print(transpoz);

    }

    // Matrisi yazdırmak için yardımcı fonksiyon
    static void print(int[][] yazdir) {
        for (int[] i : yazdir) {

            for (int j = 0; j < yazdir[0].length; j++) {
                System.out.print(i[j] + "\t");
            }

            System.out.println();

        }
    }

}